package Class10.GroupProject;

public class Project4 {
    public static void main(String[] args) {

       int[][] nums ={{6,3,2,7},{5,8,9,4}};
        System.out.println("The even numbers are :");
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {

                if (nums[i][j]%2==0){
                    System.out.println(nums[i][j]+" ");
                }

            }

        }
    }
}
