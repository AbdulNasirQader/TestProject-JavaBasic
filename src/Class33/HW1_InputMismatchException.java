package Class33;
/*1) How would handle InputMismatchException? Input Mismatch Exception when user
        enters mismatch value then programmer expected.
        */

import java.util.InputMismatchException;
import java.util.Scanner;
public class HW1_InputMismatchException {
    public static void main(String[] args) {

        // 1)
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        // Example 1: Using a try-catch block to handle InputMismatchException
        try {
            System.out.print("Enter the first number: ");
            num1 = input.nextInt();

            System.out.print("Enter the second number: ");
            num2 = input.nextInt();

            int sum = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integers.");
            input.next(); // discard the invalid input

            // restart the program
            System.out.println("Restarting...");
            main(args);
        }
            // Example 2: Using a loop to handle InputMismatchException
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.print("Enter the first number: ");
                    num1 = input.nextInt();

                    System.out.print("Enter the second number: ");
                    num2 = input.nextInt();

                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter integers.");
                    input.next(); // discard the invalid input
                }
            }

            int product = num1 * num2;
            System.out.println("The product of " + num1 + " and " + num2 + " is " + product);

            input.close();

        /*    In this example, we have two different ways of handling InputMismatchException:

        Example 1: Using a try-catch block to handle InputMismatchException

        In this example, we use a try-catch block to handle the InputMismatchException that may be
        thrown when we call the nextInt() method of the Scanner object. If an exception is thrown,
        we catch it and print an error message to the console. We also call the next() method
        of the Scanner object to discard the invalid input, so that the program can continue.
        In addition, we restart the program by calling the main() method again with the same arguments,
        so that the user can try again.

        Example 2: Using a loop to handle InputMismatchException

        In this example, we use a while loop to repeatedly ask the user to enter two integers
        until they enter valid input. Inside the loop, we use a try-catch block to handle the
        InputMismatchException that may be thrown when we call the nextInt() method of the Scanner object.
        If an exception is thrown, we catch it and print an error message to the console.
        We also call the next() method of the Scanner object to discard the invalid input,
        so that the program can continue. Once the user enters valid input, we set the validInput
        variable to true and exit the loop. We then calculate the product of the two numbers
        and print it to the console.*/
}}
