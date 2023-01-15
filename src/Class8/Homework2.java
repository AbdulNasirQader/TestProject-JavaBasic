package Class8;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Would you like to apply for a credit card? (yes/no): ");
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for applying!");
                break;
            } else if (i == 10) {
                System.out.println("Thank you for your time.");
            }
        }
        scanner.close();
}}
