package day55_abstraction.interface_demo;

public interface WebDriver {
    public abstract void get(String url);
    public abstract void findElement(String locator);
    void quite(); // it is automatically public abstract
    String getTitle();


}
