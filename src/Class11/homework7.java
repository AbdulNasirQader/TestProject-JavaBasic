package Class11;

public class homework7 {
    public static void main(String[] args) {

        int[][] num = {{3, 7, 23, 12},
                {1, 6, 13, 22},
                {15, 17, 4, 16}};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 == 0) {
                    System.out.print(num[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("------------");
        for (int[] x : num) {
            for (int odd : x) {
                if (odd % 2 == 0) {
                    System.out.print(odd + " ");
                }
            }
        }

    }
}
