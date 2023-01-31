package Class17;

public class Homework2 {

    String name;
    int ssn;
    String state;
    String phoneNumber;

    private Homework2(String name2,int ssn2,String state2,String number){
        name=name2; //Tom
        ssn=ssn2;
        state=state2;
        phoneNumber=number;

    }
    Homework2(String name2,String number,String state2) {
        name = name2; //Thomas
        state = state2;
        phoneNumber = number;
    }
    protected Homework2(String name2,int ssn2,String number) {
        name = name2;
        ssn = ssn2;
        phoneNumber = number;
    }
    public Homework2(int ssn2,String state2,String number,String name2) {
        ssn = ssn2;
        state = state2;
        phoneNumber = number;
        name=name2; //Katy
    }

    public void print(){
        System.out.println(name+ssn+state+phoneNumber);
    }

    public static void main(String[] args) {
        Homework2 pri=new Homework2("Tom ",1234567," WI "," (789)456-3278");
        pri.print();
    }
}
