package Class8;

public class NestedLoops6 {
    public static void main(String[] args) {
                 // first way

        /*for (int i = 0; i <3; i++) {

            if(i==0){
                for (int j = 0; j <=5; j++) {
                    System.out.print(j+"");

                }
            }else if(i==1){
                for (int j = 0; j <= 5; j++) {
                    System.out.print(j+"");

                }
            }else if(i==2){
                for (int j = 2; j <= 5 ; j++) {
                    System.out.print(j+"");

                }
            }
            System.out.println();

        }*/

                 //unique shape output

       /* for (int i = 0; i <=5 ; i++) {
            for (int j= i; j <=5 ; j++) {
            System.out.print(j+" ");

        }
            System.out.println();
    }*/
                 //second way
        for (int i = 0; i < 3; i++) {
            for (int j = i; j <= 5 ; j++) {
                System.out.print(j+" ");

            }
            System.out.println();

        }
}}
