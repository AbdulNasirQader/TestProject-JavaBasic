package Class29;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MapDemo {
    public static void main(String[] args) {

        HashMap<String,Integer> groceries= new HashMap<>();
       // LinkedHashSet<String,Integer> groceries=new LinkedHashSet<>();
        //TreeSet<String,Integer> groceries=new TreeSet<>();
        groceries.put("Eggs",10);
        groceries.put("Milk",5);
        groceries.put("Bread",5);
        groceries.put("Rice",6);
        groceries.put("Meat",7);
        groceries.put("Soap",5);

        System.out.println(groceries.get("Rice"));
        System.out.println(groceries);

        System.out.println(groceries.isEmpty());
        System.out.println(groceries.size());
        groceries.remove("Meat");
        System.out.println(groceries);
        //System.out.println(groceries.remove());
    }
}
