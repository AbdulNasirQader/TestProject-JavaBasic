package Class8;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double itemPrice;
        double amountPaid = 0;
        String item;
        boolean done = false;
        while (!done) {
            System.out.print("Enter item you want to buy: ");
            item = scanner.nextLine();
            System.out.print("Enter price of the item: ");
            itemPrice = scanner.nextDouble();
            scanner.nextLine();
            while (amountPaid < itemPrice) {
                System.out.print("Enter payment amount: ");
                double payment = scanner.nextDouble();
                scanner.nextLine();
                amountPaid += payment;
                double remaining = itemPrice - amountPaid;
                if (remaining > 0) {
                    System.out.println("Amount remaining: " + remaining);
                } else {
                    double change = -remaining;
                    System.out.println("Change: " + change);
                }
            }
            System.out.print("Do you want to buy anything else? (yes/no): ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("no")) {
                done = true;
            }
            amountPaid = 0;
        }
        System.out.println("Thank you for shopping!");
        scanner.close();
    }
}
