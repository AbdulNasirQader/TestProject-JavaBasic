package Class11;

public class HomeworkDogTester {
    public static void main(String[] args) {

        DogDemo Husky = new DogDemo();
        Husky.name="Rocky";
        Husky.age=2;
        Husky.color="Dark grey and white";
        Husky.sleep();
        Husky.eat();
        Husky.play();

        DogDemo Bulldog = new DogDemo();
        Bulldog.name="Hulk";
        Bulldog.color="Grey and White";
        Bulldog.age=5;
        Bulldog.sleep();
        Bulldog.play();
        Bulldog.eat();

        DogDemo Labrador = new DogDemo();
        Labrador.name="lilly";
        Labrador.color="white";
        Labrador.age=4;
        Labrador.sleep();
        Labrador.eat();
        Labrador.play();
    }
}
