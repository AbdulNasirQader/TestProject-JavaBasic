package Class5;

import java.util.Scanner;

public class SwitchCaseDemo6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your Gender m f");
        char gender = scan.next().charAt(0);

        switch (gender) {

            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("not specified");
        }
    }
}