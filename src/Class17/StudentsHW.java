package Class17;

public class StudentsHW {

    String name;
    int math;
    int literature;
    int sience;

    StudentsHW(String name2,int math2,int literature2,int sience2){
        name=name2;
        math=math2;
        literature=literature2;
        sience=sience2;
    }
    void print(){
        int average=(math+literature+sience)/3;
        System.out.println(name+"'s average score is "+average);
    }
}
