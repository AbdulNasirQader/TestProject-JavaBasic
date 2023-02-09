package Class22;

public class CreditCard {

     double balance;
     double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public double calculateInterest() {
        return balance * (interest / 100);
    }
}

class Visa extends CreditCard {
    public Visa(double balance, double interest) {
        super(balance, interest);
    }
}

class AX extends CreditCard {
    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    public double calculateInterest() {
        return balance * (interest / 100) * 1.5;
    }
    public static void main(String[] args) {
        CreditCard cc = new CreditCard(1000, 10);
        System.out.println("Credit Card Interest: " + cc.calculateInterest());

        Visa visa = new Visa(1500, 12);
        System.out.println("Visa Interest: " + visa.calculateInterest());

        AX ax = new AX(2000, 15);
        System.out.println("AX Interest: " + ax.calculateInterest());
    }
}

