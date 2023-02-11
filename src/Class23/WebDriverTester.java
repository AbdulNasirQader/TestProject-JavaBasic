package Class23;

public class WebDriverTester {
    public static void main(String[] args) {

       /* WebDriver webDriver=new Safari();// Up casting
        //FireFOX fireFOX=new WebDriver() down casting
        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();*/

         // an Array of type parent class can hold the objects of all the child classes
        Chrome chrome=new Chrome();
        FireFOX fireFOX=new FireFOX();
        Safari safari=new Safari();

        //  WebDriver [] browsers={chrome,fireFOX,safari};array short way
       WebDriver [] browsers={new Chrome(),new Safari(),new FireFOX()};

                //Enhanced for loop
       for (WebDriver browser:browsers){
           browser.startBrowser();
           browser.openURL();
           browser.testLoginPage();
           browser.closeBrowser();
       }

       /* Safari safari=new Safari();
        safari.startBrowser();
        safari.openURL();
        safari.testLoginPage();
        safari.closeBrowser();

        FireFOX fireFOX=new FireFOX();
        fireFOX.startBrowser();
        fireFOX.openURL();
        fireFOX.testLoginPage();
        fireFOX.closeBrowser();*/


    }
}
