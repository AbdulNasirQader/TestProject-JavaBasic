package Class16;

public class Students {
    /*
    Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students
     */

    String name;
    String id;
    static int noOfStudents;

    public static void main(String[] args) {

        Students nasir=new Students();
        nasir.name="Nasir";
        nasir.id="1";
        nasir.noOfStudents++;

        Students nezir=new Students();
        nezir.name="nezir";
        nezir.id="2";
        nezir.noOfStudents++;
        System.out.println(Students.noOfStudents);
    }
}
