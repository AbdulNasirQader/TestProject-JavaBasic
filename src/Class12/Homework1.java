package Class12;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a word");
        String word=input.nextLine();

        if (!word.isEmpty()) {
            if (word.length() % 2 != 0 && word.length() >= 3) {
                int middleChar= word.length() / 2;
                System.out.println(word.charAt(middleChar));
            }else{
                System.out.println("Invalid word");
            }
        }
    }
}
