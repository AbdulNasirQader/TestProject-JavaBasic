package Class30;

import java.util.HashMap;
import java.util.Map;

public class Homework1 {
    /*
 1) Create a map of Best Buy store. Place
     item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
     Retrieve all keys and values from a Best Buy map using EntrySet.
  */
    public static void main(String[] args) {
        Map<Integer,String> bestBuy=new HashMap<>();
        bestBuy.put(785124,"TV");
        bestBuy.put(455124,"Printer");
        bestBuy.put(457854,"Laptop");
        bestBuy.put(784576,"AirPods");
        bestBuy.put(785268,"Charger");

        var entrySet=bestBuy.entrySet();


        for(var entry:entrySet){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }

    }
}
