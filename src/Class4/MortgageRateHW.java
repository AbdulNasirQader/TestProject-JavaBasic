package Class4;

public class MortgageRateHW {
    public static void main(String[] args) {
        double mortgageRate=4.0;
        int housePrice=240000;
        if(mortgageRate<4.5){
            System.out.println("I will buy a house");
            if(housePrice>200000){
                System.out.println("I will take a loan");
            }else{
                System.out.println("I will pay cash");
            }
        }else{
            System.out.println("I will not buy a house");
        }
    }
}
