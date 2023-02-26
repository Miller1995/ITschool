package challengeString;

import java.util.Scanner;

public class SpaceString {
    public static void main(String[] args) {

        // Simple, remove the spaces from the string, then return the resultant string.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        String str = scanner.nextLine();

        System.out.println(space(str));
    }

    public static String space(String str){                 // use replaceAll and regex pattern
        str = str.replaceAll("\\s","");
        return  str;
    }
}
