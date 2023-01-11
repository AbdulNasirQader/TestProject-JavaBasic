package Class4;

import java.util.Scanner;

public class YearsWorkedHW {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your work years");
        int workedYears= input.nextInt();
        if(workedYears>=6){
            System.out.println("You eligible for bonus");

            System.out.println("Enter your annual salary");
            int salary= input.nextInt();
            if(salary>60000){
                System.out.println("you got 6000 bonus");
            }else{
                System.out.println("you got 4000 bonus");
            }
        }else{
            System.out.println("you not eligible for bonus");
        }
    }
}
