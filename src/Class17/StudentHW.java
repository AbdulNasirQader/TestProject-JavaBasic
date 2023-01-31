package Class17;

public class StudentHW {


    String sName;
    String sAddress;

    StudentHW(String name, String address){
        sName=name;
        sAddress=address;
    }

    void displayInfo(){
        System.out.println("Student name "+sName+" address "+sAddress);
    }
}
