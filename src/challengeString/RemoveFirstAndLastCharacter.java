package challengeString;

public class RemoveFirstAndLastCharacter {

    public static void main(String[] args) {

                /* It's pretty straightforward.
                   Your goal is to create a function that removes the first and last characters of a string.
                   You're given one parameter, the original string.
                   You don't have to worry with strings with less than two characters.
                 */
        String str = "eloquent";
        System.out.println(str.substring(1,(str.length()-1)));
    }
}
