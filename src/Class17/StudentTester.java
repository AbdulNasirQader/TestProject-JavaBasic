package Class17;

public class StudentTester {
    public static void main(String[] args) {

                                  //This is with Constructor
        Student Nasir = new Student("Nasir","123",25,25.0);
        Nasir.printInfo();
        Student Nelson = new Student("Nelson","456",28,27.1);
        Nelson.printInfo();
        Student Slava = new Student("Slava","789",30,28.0);
        Slava.printInfo();
        Student Hiral = new Student("Hiral","321",22,28.0);
        Hiral.printInfo();
        Student Asil = new Student("Asil","654",21,28.0);
        Asil.printInfo();




                //This is without Constructor
        /*Student student1=new Student();
        student1.name="Nasir";
        student1.id="123";
        student1.age=25;
        student1.weight=25.0;8*/
    }
}
