package Class19;

public class Teachers {

    String teacherName;
    String teacherId;

    public void homework() {
        System.out.println("Homeworks make students perfect!!!!");
    }

    public void grade() {
        System.out.println("Grade doesn't matter");
    }

    public void scholarship() {
        System.out.println("Good students from this class will get scholarship");
    }

    public void ExtraPoint() {
        System.out.println("All students attend the class will get extra point");
    }
}
class MathTeacher extends Teachers{
    String subject;
    String grade;

    void excellent(){
        System.out.println("This class is excellent");
    }
}

class ChemistryTeacher extends Teachers{
    String homework;
    String test;

    void science(){
        System.out.println("Chemistry class is fun");
    }
}

class PianoTeacher extends Teachers{
    String classic;
    String schedule;

    void happy(){
        System.out.println("This class make students happy");
    }
}

