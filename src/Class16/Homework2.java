package Class16;

public class Homework2 {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Homework2 task2=new Homework2();
        System.out.println(task2.reverseString("hello"));
    }
}

