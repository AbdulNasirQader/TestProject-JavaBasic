package Class16;

public class Homework3 {

    private String vowels(String str) {
        String newStr = str.replaceAll("[^aeiou]", "");
        return newStr;
    }

    public static void main(String[] args) {

        Homework3 task3=new Homework3();
        String str="Hello World";
        System.out.println(task3.vowels(str));
    }
}