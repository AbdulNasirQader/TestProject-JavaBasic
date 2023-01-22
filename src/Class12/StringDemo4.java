package Class12;

public class StringDemo4 {
    public static void main(String[] args) {
       /*        // True
        String str="";
        System.out.println(str.isEmpty());

               // False
        String str2="trooifk";
        System.out.println(str.isEmpty());

        */

        String str="     ";
        boolean isEmpty=str.isEmpty();
        System.out.println(isEmpty);

        System.out.println(str.isBlank());
    }
}
