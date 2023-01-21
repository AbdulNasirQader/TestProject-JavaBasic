package Class10.GroupProject;

public class Project5 {
    public static void main(String[] args) {

        int sum=0;
        int sum1=0;
        int[][] ints={{1,2,3,4},{5,6,7,8}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if(ints[i][j] % 2 == 0){
                    sum+= ints[i][j];
                }else{
                    sum1+=ints[i][j];
                }

            }

        }
        System.out.println("the sum of even numbers is : " + sum);
        System.out.println("the sum of odd numbers is : " + sum1);
    }
}
