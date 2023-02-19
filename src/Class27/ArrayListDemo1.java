package Class27;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // we have created Array of Strings
        //<> that are called diamond operator or angle brackets we specify that data type in them
        ArrayList<String> names=new ArrayList<>();

        //add method to add elements to this arraylist
        names.add("Nasir");
        names.add("Nelson");
        names.add("Asli");
        names.add("Daria");
        names.add("Slava");
        names.add("Abeera");

        System.out.println(names);

    }
}
