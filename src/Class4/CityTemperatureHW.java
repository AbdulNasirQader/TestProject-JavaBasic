package Class4;

import java.util.Scanner;

public class CityTemperatureHW {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("what is your city");
        String city= input.nextLine();
        System.out.println("what is the temperature");


        double temp= input.nextInt();
        temp=(temp-32)*.5557;
        System.out.println("The temperature is "+temp+" celsius "+ "the city is "+ city);

    }
}
