package Class19;

public class TeachersTester {
    public static void main(String[] args) {

        Teachers tc=new Teachers();
        tc.teacherName="Babara";
        tc.teacherId="T121";

        System.out.println("This is principal "+tc.teacherName);
        tc.ExtraPoint();

        MathTeacher mt=new MathTeacher();
        mt.teacherName="Luna";
        mt.teacherId="M221";
        mt.subject="Math";
        System.out.println("Teacher "+mt.teacherName+" teach "+ mt.subject);
        mt.excellent();
        mt.homework();

        ChemistryTeacher ct=new ChemistryTeacher();
        ct.teacherName="Leonardo";
        ct.teacherId="C332";
        System.out.println("This class teach by "+ct.teacherName);
        ct.science();
        ct.homework();
        ct.scholarship();


        PianoTeacher pt=new PianoTeacher();
        pt.teacherName="Alice";
        pt.teacherId="P456";

        System.out.println("This class open for all grade teach by "+pt.teacherName);
        pt.happy();
        pt.grade();


    }
    }

