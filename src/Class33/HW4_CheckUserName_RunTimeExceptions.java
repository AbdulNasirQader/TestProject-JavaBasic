package Class33;
import org.apache.logging.log4j.message.Message;

import java.util.function.Consumer;

/*Create a method checkUserName that will throw a runtime exception. Method should
        throw an exception when entered username is less than 5 characters.*/
public class HW4_CheckUserName_RunTimeExceptions {
    public static void main(String[] args) {
        String[] names = {"JohnDoe", "Mike", "BobMarley", "Ann"};

        // Example 1: using an if-statement
        for (String name : names) {
            try {
                checkUserName(name);
                System.out.println(name + " is valid");
            } catch (RuntimeException e) {
                System.out.println("Entered name length in not valid! - " + e.getMessage());
            }
        }
        System.out.println("----------------------------------------------------");

        // Example 2: using a lambda expression
        Consumer<String> check = (String username) -> {
            String message = (username.length() >= 5) ? "Username is valid" : "Username must be at least 5 characters long";
            if (username.length() < 5) {
                throw new RuntimeException(message);
            }
        };

        for (String name : names) {
            try {
                check.accept(name);
                System.out.println(name + " is valid");
            } catch (RuntimeException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static void checkUserName(String username) {
        if (username.length() < 5) {
            throw new RuntimeException("Username must be at least 5 characters long");
        }
    }



}
