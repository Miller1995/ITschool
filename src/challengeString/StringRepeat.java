package challengeString;

public class StringRepeat {

        /*Write a function that accepts an integer n and a string s as parameters,
            and returns a string of s repeated exactly n times.
         */

    public static void main(String[] args) {

        int number = 2;
        String word = "bad";

        System.out.println(repeatString(number,word));
        System.out.println(repeatString2(4,word));
        System.out.println(repeatString3(7, word));
    }

    // use concat method
    public static String repeatString(int repeat, String str){
        String x = "";
        for (int index = 0; index < repeat; index++){
            x = x.concat(str);
        }
        return x;
    }

    // use append method and StringBuilder
    public static String repeatString2(int number, String str){
        StringBuilder stringBuilder = new StringBuilder();
            for ( int index = 0; index < number; index++) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    // use string repeat method()
    public static String repeatString3(int number, String str){
        return str.repeat(number);
    }

}
