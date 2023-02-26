package challengeString;

import java.util.Arrays;

public class SmashString {

    public static void main(String[] args) {

        /* Write a function that takes an array of words and smashes them together into a sentence and returns the sentence.
        You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word.
        Be careful, there shouldn't be a space at the beginning or the end of the sentence! */

        String[] array = new String[]{"Nirca", "Anton"};

        String str = smash(array, " ");
        System.out.println(str);


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
}
