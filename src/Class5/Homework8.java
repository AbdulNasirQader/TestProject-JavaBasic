package Class5;

import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter first number");
        double number1=scan.nextDouble();

        System.out.println("Please enter second number");
        double number2=scan.nextDouble();

        System.out.println("Please enter operator +,-,*,/");
        char operator=scan.next().charAt(0);

        switch (operator){

            case '+':
                System.out.println("Your result:"+(number1+number2));
                break;
            case '-':
                System.out.println("Your result:"+(number1-number2));
                break;
            case '*':
                System.out.println("Your result:"+(number1*number2));
                break;
            case '/':
                System.out.println("Your result:"+(number1/number2));
                break;
            default:
                System.out.println("Invalid");

        }
    }
}
