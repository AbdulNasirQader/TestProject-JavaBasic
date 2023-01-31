package Class17;

public class Homework1 {

    String name;
    String id;
    int age;
    double weight;

    Homework1(String name1, String id2, int age2, double weight2){
        name=name1;
        id=id2;
        age=age2;
        weight=weight2;
    }
    Homework1(){

    }
    void print(){
        System.out.println(name+" "+id+" "+age+" "+weight);
    }
}
