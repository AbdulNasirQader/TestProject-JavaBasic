package Class9;

public class ArrayDemo {
    public static void main(String[] args) {

        String name="Nasir";
        String name2="Nelson";
        String name3="Tarik";
        String name4="Asli";
        String name5="Natalia";

        String [] names={"Nasir","Nelson","Tarik","Asli","Natalia","Hiral"};

        System.out.println(name2);
        System.out.println(names[1]);
        System.out.println(names[3]);
        System.out.println(names[5]);
        // System.out.println(names[500]); error because there is no name on index number 500
        // System.out.println(names[-5]); error because index can't be negative

        for (int i = 0; i <=6 ; i++) {
            System.out.println(names[i]);

        }

    }
}
