package Class27;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Nasir");
        names.add("slava");
        names.add("Sam");
        names.add("Abeera");
        names.add("Tarik");
        names.add("Asli");

        System.out.println(names.contains("Daria"));
        System.out.println(names);
        names.remove("Sam");
        System.out.println(names);

        names.set(3,"Sam");
        System.out.println(names);
        System.out.println(names.indexOf("Slava"));
    }
}
