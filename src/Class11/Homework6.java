package Class11;

public class Homework6 {
    public static void main(String[] args) {

        int[][] num={{8,2,10},
                {7,3,5},
                {4,6,15}};

        int sum=0;

        for (int i = 0; i <num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sum+=num[i][j];
            }
        }
        System.out.println(sum);

    }
}
