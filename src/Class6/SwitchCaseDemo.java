package Class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        String country="USA";

        System.out.println(country.toLowerCase());

        switch (country.toLowerCase()){// converts the text to Lowercase USA=>usa

            case "usa":
                System.out.println("Burgers");
                break;
            case "Italy":
                System.out.println("Pasta");
                break;
            case "afghanistan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong country");


        }
    }
}
