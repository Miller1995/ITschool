package challengeString;

public class ReverseVowelsString {

    public static void main(String[] args) {

        /*  In this kata, your goal is to write a function which will reverse the vowels in a string.
            Any characters which are not vowels should remain in their original position.
            Here are some examples:
            reverseVowels("Hello!"); ---> "Holle!"
            reverseVowels("Tomatoes"); ---> "Temotaos"
            reverseVowels("Reverse Vowels In A String"); ---> "RivArsI Vewols en e Streng"
            For simplicity, you can treat the letter y as a consonant, not a vowel.         */

        String string = "Dont worry, be happy";
        System.out.println(reverseVowels(string));

    }

    // function for check the vowel
    public static boolean isVowels(char c){
        return (c == 'a' || c == 'A' ||
                c == 'e' || c == 'E' ||
                c == 'i' || c == 'I' ||
                c == 'o' || c == 'O' ||
                c == 'u' || c == 'U' );
    }

    // function for revers the position of vowels
    public static String reverseVowels(String str){
        char[] arrayVowels = str.toCharArray();
        int position = 0;
        String vowel = "";


        // sort the vowel
        for (int index = 0; index < arrayVowels.length; index++){
            if (isVowels(arrayVowels[index])){                               // identify the vowel in array after index
                position++;                                                  // if the vowel is finding, position increment, initial  position = 0 -> 1 -> 2 -> 3 -> 4
                vowel = vowel + arrayVowels[index];                          // in string vowel add a char(vowel), initial vowel = "" -> "o" -> "oo" -> "ooe" -> "ooea"
            }
        }

        for (int index = 0; index < arrayVowels.length; index++){
            if (isVowels(arrayVowels[index])){                              // identify the vowel in array after index
                position--;                                                 // after find the vowel decrement position
                arrayVowels[index] = vowel.charAt(position);                // put the vowel after position in place where was found the vowel
            }
        }
        return String.valueOf(arrayVowels);
    }
}
