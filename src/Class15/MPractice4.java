package Class15;

import java.sql.SQLOutput;

public class MPractice4 {
    /*
    create a method that takes two numbers as parameters and return the larger number.
    return type= int
    name= largerNumber
    parameters= int num1, int num2
    {
    if
    }
     */
              // way 1
    int largerNumber(int num1, int num2){
        if (num1 > num2) {
            return num1;
        }else{
            return num2;

                      //way 2
           // return (num1 > num2) ? num1 : num2;
        }
    }

    public static void main(String[] args) {
        MPractice4 mp=new MPractice4();
        System.out.println(mp.largerNumber(12,13));
    }
}
