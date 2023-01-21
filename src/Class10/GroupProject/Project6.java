package Class10.GroupProject;

import java.util.Arrays;

public class Project6 {
    public static void main(String[] args) {

        int[] ints={1,14,73,5,17,91,88};
        int sum= ints[1]+ints[5];
        ints[1]=ints[5];
        ints[5]=sum-ints[1];
        System.out.println(Arrays.toString(ints));
    }
}
