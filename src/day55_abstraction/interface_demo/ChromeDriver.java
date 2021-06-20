package day55_abstraction.interface_demo;

public class ChromeDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("ChromeDriver - navigate to " + url );
    }

    @Override
    public void findElement(String locator) {
        System.out.println("ChromeDriver -locating element by" + locator);

    }

    @Override
    public void quite() {
        System.out.println("");

    }

    @Override
    public String getTitle() {
        return null;
    }
}
