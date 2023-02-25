package Class28;

import java.util.ArrayList;

public class Homework3 {
    public static void main(String[] args) {

       /*
       Create an arrayList of words. Remove every word that ends with “e”.
       */

        ArrayList<String> makeup=new ArrayList<>();
        makeup.add("Lipstick");
        makeup.add("Eyeline");
        makeup.add("Blushone");
        makeup.add("Foundation");
        makeup.add("Mascarae");

        makeup.removeIf(x-> x.endsWith("e"));
        System.out.println(makeup);
    }
}
