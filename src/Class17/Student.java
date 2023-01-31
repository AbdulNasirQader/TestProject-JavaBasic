package Class17;

public class Student {
    /*
       Create a class call it Student define 4 instance fields like id Name age weight
        create 5 objects of this class do this task without constructors and with constructors
     */

    String name;
    String id;
    int age;
    double weight;

               // This is a Constructor
   /* public Student(String studentName,String studentId,int studentAge){
        name=studentName;
        id=studentId;
        age=studentAge;
    }*/
   public Student(String studentName,String studentId
            ,int studentAge,double studentWeight){
        name=studentName;
        id=studentId;
        age=studentAge;
        weight=studentWeight;
    }
    void printInfo(){
        System.out.println(" Name "+name+" Id "+id+" age "+age+
                " Weight "+weight);

       /* void printInfo(){
            System.out.println(" Name "+name+" Id "+id+" Age "+age);
        }*/
    }





}
