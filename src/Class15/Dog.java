package Class15;

public class Dog {

    String name;//instance variable
    String breed;//instance variable
    String color;//instance variable
    static int noOfLegs =4;//static variable
    void printFood(){
        String food="Meat";//local
        System.out.println(food);
    }

    void printColor(){
        //System.out.println(food);
        System.out.println(name);
    }
}
