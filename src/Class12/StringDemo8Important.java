package Class12;

public class StringDemo8Important {
    public static void main(String[] args) {

        String str="Java is love";
        char c=str.charAt(2);
        System.out.println(c);

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));

        }
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
