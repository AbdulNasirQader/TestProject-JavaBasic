package Class26.Project2;



    public interface WebDriver {
        void open();
        void close();
        String getTitle();

    }
    interface RemoteWebDriver extends WebDriver{
        void navigate();

    }

    interface TakesScreenshot extends RemoteWebDriver{
        void getScreenshot();

    }

    class ChromeDriver implements RemoteWebDriver, WebDriver{

        @Override
        public String getTitle() {
            return "Chrome";
        }
        @Override
        public void open() {
            System.out.println("Chrome Driver is opening...");
        }

        @Override
        public void navigate() {
            System.out.println("Navigate to https://www.google.com");
        }

        @Override
        public void close() {
            System.out.println("Google Driver is shutting down...");
        }
    }

    class FireFoxDriver implements RemoteWebDriver, WebDriver{

        @Override
        public String getTitle() {
            return "FireFox";
        }

        @Override
        public void open() {
            System.out.println("FireFox Driver is opening...");
        }

        @Override
        public void navigate() {
            System.out.println("Navigate to https://www.amazon.com");
        }

        @Override
        public void close() {
            System.out.println("FireFox Driver is shutting down...");
        }

    }

    class SafariDriver implements RemoteWebDriver, WebDriver{

        @Override
        public String getTitle() {
            return "Safari";
        }

        @Override
        public void open() {
            System.out.println("Safari Driver is opening...");
        }

        @Override
        public void navigate() {
            System.out.println("Navigate to https://www.yahoo.com");
        }

        @Override
        public void close() {
            System.out.println("Safari Driver is shutting down...");
        }


    }

