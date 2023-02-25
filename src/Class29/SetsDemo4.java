package Class29;

import java.util.TreeSet;

public class SetsDemo4 {
    public static void main(String[] args) {

        // sets to low number to higher number in order
        TreeSet<Integer> numbers= new TreeSet<>();
        numbers.add(50);
        numbers.add(40);
        numbers.add(100);
        numbers.add(20);
        numbers.add(35);
        numbers.add(50);
        System.out.println(numbers);
    }
}
