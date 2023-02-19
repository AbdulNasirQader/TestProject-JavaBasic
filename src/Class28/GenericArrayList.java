package Class28;

import Class17.DogTester;
import Class26.Dog;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class GenericArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();

        names.add("10");


        Object a=new String("some value");
        Object b=new Integer(10);
        Object c=new Scanner(System.in);

        //No one now uses the arrays like this.
        ArrayList name=new ArrayList();
        name.add("Nasir");
        name.add(10);
        name.add('a');
        name.add(new Dog("Jacky","Green","unknow"));

        for (Object j:name){
            ((String)j).trim();
        }

    }
}
