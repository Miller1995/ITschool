package FibonacciSequence;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        for (int index = number; index < (number + 10); index++)
            System.out.println(getFibonacciNumbers(index));
    }


    public static long getFibonacciNumbers(int number) {
        if (number <= 1)
            return number;
        return (getFibonacciNumbers(number - 1) + getFibonacciNumbers(number - 2));
    }
}
