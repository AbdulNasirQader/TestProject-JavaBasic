package Class8;

public class NestedLoop7 {
    public static void main(String[] args) {
                   //first way
       /* for (int i = 1; i < 4 ; i++) {
            for (int j = 0; j <=i* 5 ; j= j +i) {
                System.out.print(j+" ");

            }
            System.out.println();

        }*/
                   //second way
      /*  for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(j*(i+1)+" ");

            }
            System.out.println();

        }*/
                  // third way
       /* for (int i = 0; i <=5 ; i++) {
            System.out.print(i+" ");

        }
        System.out.println();
        for (int i = 0; i <=5 ; i++) {
            System.out.print(2*i+" ");

        }
        System.out.println();
        for (int i = 0; i <=5 ; i++) {
            System.out.print(3*i+" ");

        }*/
                 // fourth way
        for (int i = 1; i <=3 ; i++) {
            for (int j = 0; j <=5 ; j++) {
                System.out.print(i*j+" ");

            }
            System.out.println();

        }
    }
}
