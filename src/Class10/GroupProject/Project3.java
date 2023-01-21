package Class10.GroupProject;

public class Project3 {
    public static void main(String[] args) {
        
        int[][] nums={{5,3,9,7},{6,8,2,4,1,10},{15,17,13}};
        int sum=0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                sum+=nums[i][j];
                System.out.println(nums[i][j]);

            }
            
        }
        System.out.println(sum);

        
    }
}
