package Class5;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your country");
        String country=scan.next();

        String language1="Turkish";
        String language2="German";
        String language3="Hindi";
        String language4="Pashto";
        String language5="French";

        if(country.equals("Turkey")){
            System.out.println("You speak: "+language1);
        }else if(country.equals("Germany")){
            System.out.println("You speak: "+language2);
        }else if(country.equals("India")){
            System.out.println("You speak: "+language3);
        }else if(country.equals("Afghanistan")){
            System.out.println("Ypu speak: "+language4);
        }else if(country.equals("France")){
            System.out.println("You speak: "+language5);
        }else{
            System.out.println("Invalid country");
        }


    }
}
