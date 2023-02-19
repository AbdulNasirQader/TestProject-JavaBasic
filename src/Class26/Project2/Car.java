package Class26.Project2;

public abstract class Car {
    double carPrice;
    String color;

    public Car(double carPrice){
        this.carPrice= carPrice;
    }
    abstract double calculateSalePrice();
}

class Truck extends Car{
    int weight;

    Truck(double carPrice, int weight){
        super(carPrice);
        this.weight= weight;
    }
    @Override
    double calculateSalePrice() {
        if(weight> 2000){
            return carPrice-= (carPrice*10)/ 100;
        }else{
            return carPrice-= (carPrice*20)/ 100;
        }
    }
}

class Sedan extends Car{
    int length;

    Sedan(int length, double carPrice){
        super(carPrice);
        this.length= length;
    }

    @Override
    double calculateSalePrice() {
        if(length> 20){
            return carPrice-= (carPrice*5)/100;
        }else{
            return carPrice-= (carPrice*10)/100;
        }

    }
}
