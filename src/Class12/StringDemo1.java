package Class12;

public class StringDemo1 {
    public static void main(String[] args) {
        //Creating an object of the string class
        String strObj=new String("Java");
        // another way of creating an object of string class a shorter way
        // mostly this is how we create the objects of string class
        String strObj2="Java";
        System.out.println(strObj2.length());
        String str="Banana";
        int len=str.length();
        System.out.println(len);
        String name="Nasir qader";
        if(name.length()>10){
            System.out.println("Name cant be more than 5 letters");
        }


    }
}
