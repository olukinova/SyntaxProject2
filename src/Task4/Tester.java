package Task4;

public class Tester {
    public static void main(String[] args) {


        RemoteWebDriver[] webDrivers = {new ChromeDriver("Chrome"), new FireFoxDriver("FireFox"),
                new SafariDriver("Safari")};

        for (RemoteWebDriver driver : webDrivers) {
            driver.open();
            driver.close();
            System.out.println(driver.getTitle());
            driver.getScreenShot();
            driver.navigate();
        }
    }
}
