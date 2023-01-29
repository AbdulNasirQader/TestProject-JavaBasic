package Class16;

public class Person {
    private double bankBalance=1250000;//only can access it in the same class
    String Address="Street 123";// default access level is applied

    public String name="Jon Snow";//you can access anywhere

    private void printPhonePassword(){//only can access this class not other classes
        System.out.println("pas123");
    }
    void printSSN(){
        System.out.println("123456789");
    }

    public void printTikTokAccount(){
        System.out.println("user123");
    }
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.Address);
        System.out.println(person.name);
        person.printPhonePassword();
        person.printSSN();
        person.printTikTokAccount();
    }
}
