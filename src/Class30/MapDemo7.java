package Class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo7 {
    public static void main(String[] args) {


        Map<Integer,String> studentsMap=new HashMap<>();
                   //Keys //Values
        studentsMap.put(1,"Nasir");
        studentsMap.put(2,"Anush");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Gul");
        studentsMap.put(6,"Bahar");
        studentsMap.put(7,"Saba");

        Set<Map.Entry<Integer,String>> entrySet=studentsMap.entrySet();

        for (Map.Entry<Integer,String> entry:entrySet){
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }
        entrySet.removeIf(x->x.getKey()>2 &&x.getValue().contains("i"));
        System.out.println(studentsMap);
    }
}
