package Class8;

import java.util.Scanner;

public class LoopWithString {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name");
        while(scan.next().equalsIgnoreCase("Sha")){
            System.out.println("Great student who always wanted an example with String in loop");
        }
    }
}
