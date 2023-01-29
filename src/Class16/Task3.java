package Class16;

public class Task3 {
    /*
    Create a method that will print whether given String is palindrome or not.
      return type= void
      name= ispalindrome
      parameters= String inputStr
      {
      }
      example dad= dad true
      abc= cba false
     */
    void isPalindrome(String str){
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();
        if(str.equals(reversedStr)){
            System.out.println(str+"is palindrome");
        }else{
            System.out.println(str+"Not is palindrome");
        }
    }

    public static void main(String[] args) {

        Task3 task3=new Task3();
      // String resut= task3.isPalindrome("Kaya"); can't assign void methods to variable
       // System.out.println(task3.isPlaindrome('Kaya')); can't use void methods in PrintLn
        task3.isPalindrome("Kaya");


    }
}
