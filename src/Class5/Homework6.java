package Class5;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter 3 different numbers");
        int number1=scan.nextInt();
        int number2=scan.nextInt();
        int number3=scan.nextInt();

        if(number1>number2){
            if(number1>number3)
            System.out.println("This is a largest number: "+number1);
        }if(number2>number3){
            if(number2>number1)
                System.out.println("This is a largest number: "+number2);
        }else{
            System.out.println("This is a largest number: "+number3);
        }
    }
}
