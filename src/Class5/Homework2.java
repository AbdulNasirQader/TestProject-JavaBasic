package Class5;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter number of weekday");
        int weekDays= scan.nextInt();

        if(weekDays>=1&&weekDays<=5){
            System.out.println("It is weekday");
        }else if(weekDays>5&& weekDays<8){
            System.out.println("It is weekend");
        }else{
            System.out.println("Invalid day");
        }
    }
}
