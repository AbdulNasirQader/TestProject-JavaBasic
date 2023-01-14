package Class8;

import java.sql.SQLOutput;

public class NestedLoops4 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {

            if(i==1){
                System.out.println();
                continue;
            }
            for (int j = 0; j < 5; j++) {
                System.out.print("*");


            }
            System.out.println();

        }
    }
}
