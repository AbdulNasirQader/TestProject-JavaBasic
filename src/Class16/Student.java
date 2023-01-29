package Class16;

public class Student {
    String name;
    String id;
   static String schoolName;
    int age=16;
    double weight;
    void printName(){
        System.out.println(name);
        System.out.println(schoolName);
    }
    static void printStudentInfo(){
        //System.out.println(name);Can't access here
        System.out.println(schoolName);
    }

}
