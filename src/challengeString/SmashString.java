package challengeString;

public class SmashString {

    public static void main(String[] args) {

        /* Write a function that takes an array of words and smashes them together into a sentence and returns the sentence.
        You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word.
        Be careful, there shouldn't be a space at the beginning or the end of the sentence! */

        String[] array = new String[]{"Nirca", "Anton"};
        String[] array2 = new String[]{"This", "was", "a", "fantastic", "exercise"};
        String[] array3 = new String[]{""};

        String str = smash(array, " ");
        System.out.println(str);
        System.out.println(smash(array3," "));

        // or the second solution
        System.out.println(smash2(array2));
        System.out.println(smash2(array3));


    }

    public static String smash(String[] strArr, String delimiter){
        StringBuilder stringBuilder = new StringBuilder();
        for(String str: strArr){
            stringBuilder.append(str).append(delimiter);
        }
        if (stringBuilder.isEmpty()){
            return stringBuilder.substring(0,stringBuilder.length());
        } else
            return stringBuilder.substring(0,stringBuilder.length() - 1);
    }

    public static String smash2(String[] strArr){           //use join method
        return String.join(" ",strArr);
    }
}
