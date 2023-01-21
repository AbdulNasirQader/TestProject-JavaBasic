package Class10.GroupProject;

public class Project10 {
    public static void main(String[] args) {

        int[] numbers={2,15,30,7,1,45,78,101,23};
        int largest=numbers[0];
        int secondLargest=numbers[1];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>largest){
                largest=numbers[i];
            }

        }
        for (int i = 0; i < numbers.length; i++) {
            if((numbers[i]<largest)&&(numbers[i]>secondLargest)){
                secondLargest=numbers[i];
            }

        }
        System.out.println("the second largest number is :"+ secondLargest);
    }
}
