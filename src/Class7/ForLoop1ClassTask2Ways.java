package Class7;

public class ForLoop1ClassTask2Ways {
    public static void main(String[] args) {

        for(int num=1;num<20;num+=2){
            System.out.println(num);
    }
        // using a for loop print odd numbers from 1 to 20
        System.out.println("************");
        for(int i=0; i<20; i++){
            if(i%2!=0){// checking if a number is odd number
                System.out.println(i);
            }
        }
}}
