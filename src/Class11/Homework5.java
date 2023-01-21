package Class11;

public class Homework5 {
    public static void main(String[] args) {

        String[][] grocery={{"Tomatoes","Broccoli","Asparagus"},
                {"Apple","Orange","cherry"},
                {"Milk","Cheese","Yogurt"},
                {"Candy","Chocolate"}};
        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j < grocery[i].length; j++) {
                System.out.print(grocery[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-----------");

        for( String[] store : grocery){
            for (String item : store){
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }
}
