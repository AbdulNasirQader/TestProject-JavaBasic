package Class6;

public class Homework1 {
    public static void main(String[] args) {

        boolean workDay=true;
        int day=1;
        while (workDay){
            if (day>4){
                System.out.println("I need a day off");
                workDay = false;
            }else{
                System.out.println("I don't need a day off anymore");
            }
            day++;
        }
    }
}
