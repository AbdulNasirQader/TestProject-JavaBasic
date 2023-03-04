package Class30;

import java.util.LinkedHashSet;

public class Task1 {
    public static void main(String[] args) {

       /*
    Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”;
       */

        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Richmond");
        cities.add("FairFax");
        cities.add("Mclean");
        cities.add("Annandale");

                //Lambda
        cities.removeIf(x->x.startsWith("A"));
        System.out.println(cities);
    }
}
