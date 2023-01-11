package Class5;

import java.util.Scanner;

public class Homework7A {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter grade (A,B,C,D");
        char grade=scan.next().charAt(0);

        if(grade=='A'){
            System.out.println("Your grade is "+grade+" Excellent");
        }else if(grade=='B'){
            System.out.println("Your grade is "+grade+" Good");
        }else if(grade=='C'){
            System.out.println("Your grade is "+grade+" Average");
        }else if(grade=='D'){
            System.out.println("Your grade is "+grade+" Bad");

        }else{
            System.out.println("Any other grade not Acceptable");
        }

    }
}
