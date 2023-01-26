package Class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {

        String str="KDHKDHIifahdjs3844534*%$@(*(()";
        System.out.println(str.replaceAll("[A-Z]","#"));
        //it will replace UpperCase letters only A to Z

        System.out.println(str.replaceAll("[a-z]","#"));
        //it will replace LowerCase letters only a to z

        System.out.println(str.replaceAll("[0-9]","#"));
        //it will replace numbers only 0 to 9

        System.out.println(str.replaceAll("[A-Za-z]","#"));
        //it will replace UpperCase and LowerCase only A to Z a to z

        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));
        //it will not '^' replace UpperCase, LowerCase, and numbers A-Z a-z 0-9

        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));
        //it will not '^' replace UpperCase, LowerCase, and numbers just special characters ""

    }
}
