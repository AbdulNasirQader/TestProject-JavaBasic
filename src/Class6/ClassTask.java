package Class6;

import java.util.Scanner;

public class ClassTask {
    public static void main(String[] args) {


       /* int a=20000, b=600, c=900;


        if (a>b&&a>c){
            System.out.println("The largest number is "+a);

        } else if (b>a&&b>c) {
            System.out.println("The largest number is "+b);


        } else if (c>a&&c>b) {
            System.out.println("The largest number is "+c);


        }*/

        Scanner scan=new Scanner(System.in);
        int number1, number2, number3;
        System.out.println("Please Enter three Number's");
        number1=scan.nextInt();
        number2=scan.nextInt();
        number3=scan.nextInt();

        if(number1>number2&& number1>number3){
            System.out.println("The Largest Number is "+number1);
        }else if (number2>number3&& number2>number1){
            System.out.println("The Largest Number is "+number2);
        }else if (number3>number2&&number3>number1){
            System.out.println("The Largest Nmuber is "+number3);
        }


    }
    }

