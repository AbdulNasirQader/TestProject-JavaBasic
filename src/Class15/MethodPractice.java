package Class15;

public class MethodPractice {
         /* create a method which returns true or false and takes the int numbers
    even it returns true otherwise it returns false
     */

    // method 1
    boolean isEven(int number){
        boolean flag;
        if(number%2==0){
            flag=true;
        }else{
            flag=false;
        }
        return flag;
    }
    // method 2
    boolean isEven1(int number){

        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }
    // method 3
    boolean isEven2(int number){

        return number%2==0;
    }
    }

