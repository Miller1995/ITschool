package FibonacciSequence;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Fibonacci or Non-Fibonacci number: ");
        int number = scanner.nextInt();

        if (!isFibonacci(number)) {
            System.out.println("Error, number isn't Fibonacci number sequence ");
        } else {
            System.out.println("Fibonacci string is: ");
            for (int index = getIndexOfNumberFibonacci(number); index < getIndexOfNumberFibonacci(number) + 15; index++)
                System.out.print(getFibonacci(index) + " ");
        }
    }
    private static int getFibonacci(int number) {
        int fibonacci[] = new int[number + 2];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int index = 2; index <= number; index++)
            fibonacci[index] = fibonacci[index - 1] + fibonacci[index - 2];
        return fibonacci[number];
    }
    private static int getIndexOfNumberFibonacci(int number){
        int prevPrev = 0;
        int prev = 1;
        int curr = 1;
        int index = 1;

        if (number <= 2)
            return number;

        while ( curr < number){
            curr = prevPrev + prev;
            index++;
            prevPrev = prev;
            prev = curr;
        }
        return index;
    }
    private static boolean isFibonacci (int number){
        int prevPrev = 0;
        int prev = 1;
        if (number == prevPrev || number == prev) {
            return true;
        }
        int curr = prevPrev + prev;
        while (curr <= number){
            if (curr == number)
                return true;
            prevPrev = prev;
            prev = curr;
            curr = prevPrev +prev;
        }
        return false;
    }
}
