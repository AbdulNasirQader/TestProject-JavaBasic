package Class9;

import java.util.Scanner;

public class ClassTask4 {
    public static void main(String[] args) {
        /*
        step one: ask user for item price and item name
        step two: accumulate the price
        step three: tell the user how much total they should pay
        step four: if user give more money program should return pay
        step five: thank you for shopping
         */

        /*
         Write a program to ask a user to enter item they want to buy and the price of that item.
          Every time user enters money accumulate the amount and tell the user how much is left to pay off.
         If user give more money program should return a change.
          Whenever a user done with payments program should say "Thank you for shopping!"
         */
       /* Scanner scan=new Scanner(System.in);
        System.out.println("Enter the item you want to buy");
        String itemName=scan.next();
        System.out.println("Enter the price of the item you want to buy");
        int priceItem=scan.nextInt();
        System.out.println("Enter the money");

        int moneyEntered=scan.nextInt();
        if(moneyEntered<priceItem){
            System.out.println("The amount left to pay off is"+(priceItem-moneyEntered));

        }else if(moneyEntered>priceItem){
            System.out.println("Your change is "+(moneyEntered-priceItem));
        }else if(moneyEntered==priceItem){
            System.out.println("Thank you for shopping");
        }*/

        Scanner scan=new Scanner(System.in);
        double totalPrice=0;
        for (int i = 0; i < 3; i++) {

            System.out.println("Please Enter the item and its price");
            String itemName = scan.next();
            double itemPrice = scan.nextDouble();
            totalPrice=totalPrice+itemPrice;
            System.out.println("This is the totalPrice amount that you have to pay "+totalPrice);
        }
        System.out.println("Please pay for the items");
        double amountPaid=scan.nextDouble();

        if(amountPaid>totalPrice){
            double chang=amountPaid-totalPrice;
            System.out.println("Hey here is your change "+chang);
        }

        }

    }

