package Class19;

public class Animals {

    String species;

    boolean mammals;

    void animalsInfo(){
        System.out.println("Species: "+species);
        System.out.println("Animal is a Mammal: "+mammals);
    }

}

class Herbivorous extends Animals{

    String type;

    void eatPlants(){
        System.out.println("Herbivorous Animal eats plants");
    }

}

class Lion extends Herbivorous{
    String name;
    int age;

    void LionInfo(){
        System.out.println("Name of an Lion: "+name);
        System.out.println("Lion's Age: "+age);
    }
}

