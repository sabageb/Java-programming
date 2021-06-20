package day55_abstraction.interface_demo;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("FirefoxDriver - navigate to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FirefoxDriver- locating element by  + locator");

    }

    @Override
    public void quite() {
        System.out.println("ChromeDriver - quitting the driver");

    }

    @Override
    public String getTitle() {
        return "Wooden Spoon";
    }
}
