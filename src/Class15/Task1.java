package Class15;

public class Task1 {
    //1) Create a method that will take 2 parameters as a numbers and prints which number is larger.
    int numbers(int num1, int num2) {
        int result = 0;
        if (num1 > num2) {
            result = num1;
        } else if (num2 > num1) {
            result = num2;

        }
        return result;
    }


}
