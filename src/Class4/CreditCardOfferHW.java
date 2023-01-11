package Class4;

public class CreditCardOfferHW {
    public static void main(String[] args) {
        boolean creditCard=true;
        int balance=300;

        if(creditCard){
            if(balance>1000){
                System.out.println("Pay them off immediately");
            }else{
                System.out.println("You can spend more");
            }
        }else{
            System.out.println("I offer you a credit card");
        }
    }
}
