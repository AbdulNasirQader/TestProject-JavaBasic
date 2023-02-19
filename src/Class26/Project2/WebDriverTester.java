package Class26.Project2;

public class WebDriverTester {


        public static void main(String[] args) {

            WebDriver[] drivers1= {new ChromeDriver(), new FireFoxDriver(), new SafariDriver()};
            for (WebDriver driver1: drivers1){
                System.out.println(driver1.getTitle());
                driver1.open();
                // driver1.navigate(); is unavailable
                driver1.close();
            }


        }
    }

