package Class27;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {

        ArrayList<Character> characters=new ArrayList<>();
        characters.add('A');
        characters.add('Z');
        characters.add('D');
        characters.add('F');
        characters.add('H');
        characters.add('G');

        for (Character c:characters){
            //System.out.println(c);//new line
            System.out.print(c+" ");//straight line
        }
    }
}
