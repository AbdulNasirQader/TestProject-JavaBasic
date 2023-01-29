package Class15;

public class Palindrome {

    boolean str(String word) {
        String reverse = "";
        boolean palindrome = true;
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        if (reverse.equalsIgnoreCase(word)) {
            return true;
        } else {

            return false;
        }
    }

}

