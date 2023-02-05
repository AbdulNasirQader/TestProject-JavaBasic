package Class19;

public class Donkey {

    String name;
    int age;
    double weight;
    /*
    Donkey(){
        System.out.println("This is a non argument constructor");
    }*/

    Donkey(String name, int age){
      this.name=name;
       this.age=age;

    }

    void print(){
        System.out.println("Donkey's name is " +name+" age is "+age+" and weight is "+weight);
    }
}
