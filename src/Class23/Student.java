package Class23;

public class Student {


    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    void takeExam() {
        System.out.println(name + " is taking an exam.");
    }

}
    class SyntaxStudent extends Student {
        String specialization;

        SyntaxStudent(String name, int age, String specialization) {
            super(name, age);
            this.specialization = specialization;
        }

        @Override
       public void study() {
            System.out.println(name + " is studying " + specialization + ".");
        }

        void attendSeminar() {
            System.out.println(name + " is attending a seminar.");
        }
    }

    class CollegeStudent extends Student {
        String major;

        CollegeStudent(String name, int age, String major) {
            super(name, age);
            this.major = major;
        }

        @Override
       public void study() {
            System.out.println(name + " is studying " + major + ".");
        }

        void participateInClub() {
            System.out.println(name + " is participating in a club.");
        }
    }

    class SchoolStudent extends Student {
        int grade;

        SchoolStudent(String name, int age, int grade) {
            super(name, age);
            this.grade = grade;
        }

        @Override
       public void study() {
            System.out.println(name + " is studying in grade " + grade + ".");
        }

        void playSports() {
            System.out.println(name + " is playing sports.");
        }


            }






