package Class11;

public class Homework4 {
    public static void main(String[] args) {

        String[][] cars = {{"Ford","Tesla","GMC"},
                {"Audi","BMW","Porsche"},
                {"Hyundai","Kia"},
                {"Ferrari","Maserati","Lamborghini","Fiat"}};
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------");
        for(String[] brand:cars){
            for(String brands:brand){
                System.out.print(brands+" ");
            }
            System.out.println();
        }
    }
}
