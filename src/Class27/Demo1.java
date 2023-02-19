package Class27;

public class Demo1 {
    public static void main(String[] args) {

        String name="Nasir";
        String name2="Asli";
        String name3="Nelson";

        String [] names={"Nasir","Hiral","Nima","Nat"};
        //displayNames(names);
        display(name,name2,name3);
    }
    //Loop
    public static void displayNames(String [] names){

        for (String name:names){
            System.out.println(name);
        }

    }
    public static void display(String name, String name2, String name3){
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
    }

}
