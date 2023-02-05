package Class19;

public class Test {
    public static void main(String[] args) {

        BankAccount ba=new BankAccount();
        ba.accountNumber=7498585949923l;
        ba.money=1000;
        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        System.out.println(" ---  Creating an Object of Checking account -----");

        Checking check=new Checking();
        //features from parent
        check.accountNumber=5765;
        check.money=780;
        //features from checking class itself
        check.interest=0;

        check.deposit();//from parent
        check.transfer();//from child

        System.out.println("----- Creating an Object of Savings account -----");

        Savings save=new Savings();
        save.accountNumber=5938283844l;
        save.money=7654;
        save.profit=100;
        //save.interest=0; siblings features are not available

        save.deposit();//from parent
        save.takeProfit();// comes from savings
        //save.transfer(); not available

        SuperSavings superSave= new SuperSavings();
        superSave.accountNumber= 23456789653l;
        superSave.money= 30000;
        superSave.profit= 900;
        superSave.deposit();
        superSave.takeProfit();
        superSave.superSaving();

        System.out.println("Account Number: "+superSave.accountNumber);
        System.out.println("Money: "+superSave.money);
        System.out.println("Profit: "+superSave.profit);
    }
}
