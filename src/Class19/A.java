package Class19;

public class A {

    static void printF(){
        System.out.println("Java");
    }
}

class B extends A{

}

class Main {
    public static void main(String[] args) {
        B b = new B();
        B.printF();
    }
}