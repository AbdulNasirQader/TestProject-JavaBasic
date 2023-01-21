package Class10.GroupProject;

public class Project8 {
    public static void main(String[] args) {

        int[] Fib = new int[10];
        System.out.println("the first 10 numbers of Fibonacci series are :");
        Fib[0] = 0;
        Fib[1] = 1;
        System.out.println(Fib[0]+" ");
        System.out.println(Fib[1]+" ");
        for (int i = 2; i < 10; i++) {
            Fib[i] = Fib[i - 1] + Fib[i-2];
            System.out.println(Fib[i]+" ");

        }

    }
}
