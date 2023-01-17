package Class9;

public class Homework1 {
    public static void main(String[] args) {

                  //Method 1

        char[] grade=new char[6];
        grade[0]= 'A';
        grade[1]= 'B';
        grade[2]= 'C';
        grade[3]= 'D';
        grade[4]= 'E';
        grade[5]= 'F';
        System.out.println("Grade: "+grade[1]);

        System.out.println("*********************");

                        //Method 2
        char [] grades={'A','B','C','D','E','F'};
        System.out.println("Grade: "+grades[1]);



    }
}
