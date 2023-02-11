package Class23;

public class WebDriver {

    public void startBrowser(){
        System.out.println("staring the browser");
    }
    public void openURL(){
        System.out.println("opening a url");
    }
    public void testLoginPage(){
        System.out.println("checking if login page works");
    }
    public void closeBrowser(){
        System.out.println("closing the browser");
    }
}
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting Google Chrome");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the url in Google Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}
class Safari extends WebDriver{

    @Override
    public void startBrowser() {
        System.out.println("Opening the Safari Browser");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the Url in Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing login page in Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the browser");
    }
}
class FireFOX extends WebDriver{

    @Override
    public void startBrowser() {
        System.out.println("Opening the FireFox");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the URl in FireFOX");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the FireFOX");
    }
}
