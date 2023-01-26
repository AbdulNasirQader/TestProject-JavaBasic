package Class13;

public class Homework6 {
    public static void main(String[] args) {

        //6) How would you swap  2 strings without a temporary variable?
        String str="summer";
        String str2="time";
        System.out.println(str + " "+ str2 );
        str=str+str2;
        str2= str.substring(0, str.length()-str2.length());
        str= str.substring(str2.length());
        System.out.println("After swapping str to str2 : " + str +" " +str2);
    }
}
