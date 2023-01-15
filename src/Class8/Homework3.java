package Class8;

import java.util.Scanner;


    public class Homework3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter start of range: ");
            int start = scanner.nextInt();
            System.out.print("Enter end of range: ");
            int end = scanner.nextInt();
            scanner.close();

            int evenSum = 0, oddSum = 0;
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    evenSum += i;
                } else {
                    oddSum += i;
                }
            }

            System.out.println("Sum of even numbers in range: " + evenSum);
            System.out.println("Sum of odd numbers in range: " + oddSum);
        }}


