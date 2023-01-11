package Class5;

public class LogicalOperators1 {
    public static void main(String[] args) {


        System.out.println(true||true);
        System.out.println(true||true);
        System.out.println(false||false);

        System.out.println(false||true|false|false);


        boolean boughtCho=true;
        boolean boughtFlowers=true;
        if(boughtCho||boughtFlowers){
            System.out.println("I Am happy");
        }else{
            System.out.println("I am sad");
        }

        boolean wifi=true;
        boolean fiveG=true;

        if(wifi||fiveG){
            System.out.println("You are good for browsing the internet");
        }else{
            System.out.println("Either connect to wifi or 5G");
        }
    }
}
