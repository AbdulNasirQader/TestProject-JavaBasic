package Class26.Project2;

public class CarTester {


        public static void main(String[] args) {
            Car[] cars= {new Truck(35000.50,1000), new Sedan(25,40000.64)};
            for (int i=0; i< cars.length; i++){
                Car car= cars[i];
                if(i==0){
                    System.out.println("Truck Sale Price: "+car.calculateSalePrice());
                } else{
                    System.out.println("Sedan Sale Price: "+car.calculateSalePrice());
                }
            }
        }

}
