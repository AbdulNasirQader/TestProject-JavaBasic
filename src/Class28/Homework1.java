package Class28;

import java.util.ArrayList;

public class Homework1 {
    /*
    /1) Create an ArrayList that will store 5 names into it.
     2) Find out whether the given ArrayList is empty or not?
     3) Check whether the specific name is present in an ArrayList or not?
     4) Find the size of your arrayList and
     5) print all values from that/
    */
    public static void main(String[] args) {

                 //first step
        ArrayList<String> names=new ArrayList<>();
        names.add("Anush");
        names.add("Manshu");
        names.add("Kanshu");
        names.add("Panshu");
        names.add("DananShu");

        System.out.println(names.isEmpty());//second step

        System.out.println(names.contains("Anush"));//third step

        System.out.println(names.size());//fourth step

        System.out.println(names);//fifth step

    }
}
