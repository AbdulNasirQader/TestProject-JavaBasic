package Class9;

public class ArrayDemo3 {
    public static void main(String[] args) {

        // create an array to store the letters A B c d e F

        char[] letters={'A','B','c','d','e','F'};
        letters[0]='a';// update the element index 0
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);

        }
    }
}
