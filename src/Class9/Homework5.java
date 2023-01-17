package Class9;

public class Homework5 {
    public static void main(String[] args) {

        int[] number= new int[5];
        number[0]= 10;
        number[1]= 2;
        number[2]= 6;
        number[3]= 8;
        number[4]= 12;
        int sum= 0;
        for (int i = 0; i < number.length; i++) {
            sum= sum + number[i];

        }
        System.out.println("The sum of all the elements is array: "+sum);
    }
}
