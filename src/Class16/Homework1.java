package Class16;

public class Homework1 {
    /*
     Create a method that will accept an array as parameters and will return a sum of
     all elements from that array.
     Method should be visibly only within same package and accessible
     by the creating an instance of the class.

     return type= int
     name= sumArrayElements
     parameters= int[] arr
     access modifier= default
     */

    int sunArrayElements(int[] array){

        int sum=0;
        for(int num:array){
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr={10,25,35,45};
        Homework1 task=new Homework1();

        System.out.println(task.sunArrayElements(arr));

    }
}
