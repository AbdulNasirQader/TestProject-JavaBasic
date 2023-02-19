package Class21;


    /*
    Create a class named 'Programming'. While creating an object of the class,
    if nothing is passed to it, then the message "I love programming languages" should be printed.
    If some String is passed to it, then in place of "programming languages"
    the value variable should be printed.
    Example, if we pass "Java", then "I love Java" should be printed.
     */
    public class Programming {

        void programmingLanguage(){
            System.out.println("I love programming languages");
        }
        void programmingLanguage(String str){
            System.out.println("I love "+str);
        }
        /*void programmingLanguage(boolean Java){
            if(Java){
                System.out.println("I love Java");
            }else{
                System.out.println("You are on the wrong Way !");
            }*/

            public static void main(String[] args) {
                Programming pr=new Programming();
                pr.programmingLanguage();
                pr.programmingLanguage("Java");

              //  new Programming("Java");
            }
        }

