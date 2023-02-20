package Task4;

public class SafariDriver implements RemoteWebDriver{
    String driverName;

    public SafariDriver(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public void navigate() {
        System.out.println(driverName + " navigates to the page");
    }

    @Override
    public void getScreenShot() {
        System.out.println(driverName + " gets screen shot");
    }

    @Override
    public void open() {
        System.out.println(driverName + " opens");
    }

    @Override
    public void close() {
        System.out.println(driverName + " closes");
    }

    @Override
    public String getTitle() {
        return driverName + " returns title";
    }
}
