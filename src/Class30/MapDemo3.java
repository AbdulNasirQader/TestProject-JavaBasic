package Class30;

import java.util.HashMap;

public class MapDemo3 {
    public static void main(String[] args) {

       /*
       Create a map of a building.//step one
       Store floor number and it is associated company name.//step two
       (Example: 1= Google, 2=Syntax etc..).
       Insert 7 entries with duplicate keys and values.//step four
       Check how many entries you have?//step five
       Update company on a 4th floor//step six
       Remove company on the 7th floor//step seven
       Print your map//step eight
       */

        HashMap<Integer,String> building=new HashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Microsoft");
        building.put(4,"Tesla");
        building.put(5,"Apple");
        building.put(6,"Amazon");
        building.put(7,"Meta");
        System.out.println(building.size());
        building.replace(4,"NVIDIA");
        System.out.println(building);
        building.remove(7);
        System.out.println(building);
    }
}
