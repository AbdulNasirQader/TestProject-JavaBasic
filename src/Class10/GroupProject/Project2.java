package Class10.GroupProject;

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String[]countries=new String[5];
        for (int i = 0; i < countries.length; i++) {
            System.out.println("Please enter a country name :");
            countries[i]=scan.next();
            System.out.println("Please enter the capital of the country :");
            String capital=scan.next();
            System.out.println("the capital of"+countries[i]+ " is "+capital);
        }
    }
}
