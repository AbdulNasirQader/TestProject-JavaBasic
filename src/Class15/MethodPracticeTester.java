package Class15;

public class MethodPracticeTester {
    public static void main(String[] args) {

        MethodPractice mp = new MethodPractice();
       boolean isEven=  mp.isEven(15);
        System.out.println(isEven);

        boolean num1 = mp.isEven(100);
        boolean num2 = mp.isEven(12);
        boolean num3 = mp.isEven(20);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
