package Class5;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Please enter quiz score");
        double quiz= scan.nextDouble();

        System.out.println("Please enter your midterm score");
        double midterm= scan.nextDouble();

        System.out.println("Please enter your final score");
        double finalScore= scan.nextByte();

        double averageScore= (quiz + midterm + finalScore)/3;

        if(averageScore>=90){
            System.out.println("grade A");
        }else if(averageScore>=70&& averageScore<90){
            System.out.println("grade b");
        }else if (averageScore>=50&& averageScore<70){
            System.out.println("grade C");
        }else if (averageScore<50){
            System.out.println("grade F");
        }
    }
}
