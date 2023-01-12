package Class7;

public class Homework3 {
    public static void main(String[] args) {
                   //first way
        for (int i = 20; i >= 1 ; i-=2) {
            System.out.println(i);
            
        }
        System.out.println("******************");
                    //2nd way
        for(int i = 20; i > 1; i--){
            if(i%2!=1){
                System.out.println(i);
            }


        }
    }
}
