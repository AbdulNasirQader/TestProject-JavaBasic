package Class5;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your height");
        int heightInch=scan.nextInt();

        if(heightInch<60){
            System.out.println("Short");
        }else if(heightInch>=60&&heightInch<=72){
            System.out.println("Medium");
        }else{
            System.out.println("Tall");
        }
    }
}
