package Class13;

public class Homework5 {
    public static void main(String[] args) {

        // How would you check if String is palindrome or not? aba=> true
        //Abbc =>false
        String str = "madam";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        } if(reverse.equals(str)){
            System.out.println(reverse+ "  is palindrome");
        }else{
            System.out.println("it is not palindrome");
        }
    }
}
