package Class5;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {

      Scanner scan= new Scanner(System.in);
        System.out.println("Please enter 3 double values, numbers must be distinct");
        double number1=scan.nextDouble();
        double number2=scan.nextDouble();
        double number3=scan.nextDouble();

        if(number1>number2&&number1>number3){
            System.out.println("The largest number is: "+number1);
        }else if(number2>number3&&number2>number1){
            System.out.println("The largest number is: "+number2);
        }else{
            System.out.println("The largest number is: "+number3);
        }
    }
}
