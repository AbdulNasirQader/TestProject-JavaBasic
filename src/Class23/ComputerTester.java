package Class23;

public class ComputerTester {

    public static void main(String[] args) {
        Computer[] computers = new Computer[4];
        computers[0] = new Apple("Apple", "Intel Core i7", 16, "macOS");
        computers[1] = new Lenovo("Lenovo", "Intel Core i5", 8, "Nvidia GTX 1650");
        computers[2] = new HP("HP", "Intel Core i3", 4, 256);
        computers[3] = new Dell("Dell", "Intel Core i7", 16, "Nvidia GTX 1650");

        for (Computer computer : computers) {
            computer.start();
            computer.shutDown();
            System.out.println();



        }}}
