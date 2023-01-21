package Class10.GroupProject;

import java.util.Arrays;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
       int[]values=new int[6];
       int sum=0;
        for (int i = 0; i < values.length; i++) {
            System.out.println("Please enter the "+i+" integer values of the array ");
            values[i]=scan.nextInt();
            sum+=values[i];

        }
        System.out.println(Arrays.toString(values));
        System.out.println("the sum of the values if : "+sum);
    }
}
