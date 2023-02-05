package Class19;

public class AnimalsTester {
    public static void main(String[] args) {

        Animals animal1 = new Animals();
        animal1.species= "Deer";
        animal1.mammals= true;
        animal1.animalsInfo();

        System.out.println("--------------------------");

        Herbivorous herbAnimal= new Herbivorous();
        herbAnimal.species= "Deer";
        herbAnimal.mammals= true;
        herbAnimal.type= "Herbivorous";
        herbAnimal.animalsInfo();
        herbAnimal.eatPlants();

        System.out.println("--------------------------");

        Lion lion1= new Lion();
        lion1.species= "Lion";
        lion1.mammals= true;
        lion1.type= "Herbivorous";
        lion1.name= "King";
        lion1.age= 10;
        lion1.animalsInfo();
        lion1.eatPlants();
        lion1.LionInfo();

    }
}
