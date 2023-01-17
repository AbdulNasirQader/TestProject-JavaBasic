package Class9;

public class Homework2 {
    public static void main(String[] args) {

                 //Method 1

        String[] names=new String[11];
        names[0] = "Nasir";
        names[1] = "Adam";
        names[2] = "Abeera";
        names[3] = "Asli";
        names[4] = "Daria";
        names[5] = "Dena";
        names[6] = "Hiral";
        names[7] = "Natalia";
        names[8] = "Nelson";
        names[9] = "Tarik";
        names[10] = "Slava";
        for (int i = 0; i < names.length; i++) {
            if(i==0){
                System.out.println(i+" Nasir");
            }

        }
                         //Method 2
        System.out.println("**********************");
        String[] name={"Nasir","Abeera","Asli","Daria","Dena","Hiral","Natalia","Nelson","Tarik","Slava"};
        System.out.println(names[0]);
    }
}
