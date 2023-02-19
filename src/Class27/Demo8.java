package Class27;

import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();

        //add method to add elements to this arraylist
        names.add("Nasir");
        names.add("Nelson");
        names.add("Asli");
        names.add("Daria");
        names.add("Slava");
        names.add("Abeera");
        System.out.println(names);
        names.clear();
        System.out.println(names);

    }
}
