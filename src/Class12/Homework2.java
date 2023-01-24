package Class12;

public class Homework2 {
    public static void main(String[] args) {

        String originalString = "Sunday";


        char[] originalStringChars = originalString.toCharArray();


        for (int i = 0; i < originalStringChars.length / 2; i++) {
            char temp = originalStringChars[i];
            originalStringChars[i] = originalStringChars[originalStringChars.length - 1 - i];
            originalStringChars[originalStringChars.length - 1 - i] = temp;
        }


        String reversedString = new String(originalStringChars);


        System.out.println(reversedString);
    }
}
