package Class16;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
       // System.out.println(person.bankBalance);//private
        System.out.println(person.Address);
        System.out.println(person.name);
        person.printSSN();
        person.printTikTokAccount();
        //person.printPassword();//is Private
    }

}
