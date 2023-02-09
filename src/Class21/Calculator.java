package Class21;

public class Calculator {

    // different ways of method overloading
    void add(int num1,int num2){
        System.out.println(num1+num2);
    }

    //changing the number of parameters
    void add(int num1,int num2,int num3){
        System.out.println(num1+num2+num3);
    }

    //changing the data type
    void add(int num1,double num2){
        System.out.println(num1+num2);
    }

    //changing the sequence
    void add(double num2,int num1){
        System.out.println(num1+num2);
    }
    void add(String num2,int num1){
        System.out.println(num1+num2);
    }
}
