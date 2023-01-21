package Class11;

public class Homework8 {
    public static void main(String[] args) {

        String[][] countries={{"Mexico","Canada","USA","Panama"},
                {"Peru","Argentina","Chile","Venezuela"},
                {"Germany","United Kingdom","Ukraine","Denmark"},
                {"Thai","Japan","India","Nepal","Pakistan"},
                {"Egypt","Madagascar","Mali","Morocco","Chad"}};

        int count=0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Sum of countries is "+count);
        System.out.println();
        System.out.println("----------");

        int count1=0;
        for(String[] x:countries){
            for(String country:x){
                System.out.print(country+" ");
                count1++;
            }
            System.out.println();
        }
        System.out.println("Sum of countries is :"+count1);
    }
    }

