package challengeString;

import java.util.Scanner;

public class ConvertNumberToString {

    public static void main(String[] args) {

                   /*
                    We need a function that can transform a number (integer) into a string.
                    What ways of achieving this do you know?
                    Examples (input --> output):
                    123  --> "123"
                    999  --> "999"
                    -100 --> "-100"             */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        String numberString = String.valueOf(number);
        System.out.println("The string number is " + numberString);
    }
}
