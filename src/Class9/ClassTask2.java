package Class9;

import java.util.Scanner;// first part

public class ClassTask2 {
    public static void main(String[] args) {

        /* //first part  |             // second part//                             |
        Create a program that will be asking user to apply for a credit card 10 times.
        As soon you get an “yes” from a user program should stop asking.
        |                   // third part                              |
         */
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {//second part
            System.out.println("Do you want a credit card");
            String userResponse=scan.next();
            if(userResponse.equalsIgnoreCase("yes")){//third part
                break;
            }

        }
    }
}
