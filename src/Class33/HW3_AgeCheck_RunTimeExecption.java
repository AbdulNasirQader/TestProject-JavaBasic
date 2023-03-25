package Class33;
/*Create a method to check age eligibility that will throw a runtime exception.
        Method should throw an exception age is less than 16.  Add two examples with explanation*/
public class HW3_AgeCheck_RunTimeExecption {
    public static void main(String[] args) {
        // example usage of the checkAgeEligibility method
        try {
            checkAgeEligibility(20); // age is eligible
            checkAgeEligibility(15); // age is not eligible, will throw exception
        } catch (RuntimeException e) {
            System.out.println("Not Eligible! - " + e.getMessage());
        }
        try {
            checkAgeEligibility(15);
            System.out.println("You are eligible!");
        } catch (RuntimeException e) {
            System.out.println("Sorry, you are not eligible.");
            System.out.println("Reason: " + e.getMessage());
        }

        try {
            checkAgeEligibility(20);
            System.out.println("You are eligible!");
        } catch (RuntimeException e) {
            System.out.println("Sorry, you are not eligible.");
            System.out.println("Reason: " + e.getMessage());
        }
    }
    public static void checkAgeEligibility(int age) {
        if (age < 16) {
            throw new RuntimeException("Age is less than 16");
        }
        System.out.println("Age is eligible");

    }
}
