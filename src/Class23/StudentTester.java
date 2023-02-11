package Class23;

public class StudentTester {
    public static void main(String[] args) {
        Student student1 = new SyntaxStudent("John", 25, "Java");
        Student student2 = new CollegeStudent("Jane", 22, "Computer Science");
        Student student3 = new SchoolStudent("Jim", 15, 10);

        student1.study();
        student2.study();
        student3.study();

        // Example of polymorphism
        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (Student student : students) {
            student.study();
            student1.takeExam();

        }
    }
}