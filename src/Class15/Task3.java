package Class15;

public class Task3 {

    String str(String word) {
        String newStr = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            newStr += word.charAt(i);
        }
        if (newStr.equalsIgnoreCase(word)) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        return newStr;
    }


}



