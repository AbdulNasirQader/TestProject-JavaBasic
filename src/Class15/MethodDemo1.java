package Class15;

import java.util.Scanner;

public class MethodDemo1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=scan.nextInt();

        System.out.println("You entered "+num);

        Method methods=new Method();
        methods.doSomeThing();
    }
}
