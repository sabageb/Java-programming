package day59_polymorphism_exceptions;


public class WebElementUtil {
    //doesnt depend on object

    /**
     * method with polymorphic parameter
     *
     * @param element and can accept any child class object
     *      like Link, InputField etc..
     *                clickElement(new Link());
     *                clickElement (new InputField());
     *                WebElement element = new Link();
     *                WebElement element = new InputField();
     */
    public static void clickElement(WebElement element) {
        System.out.println("clicking on Element");
        element.click();

    }

    public static WebElement getLinkWithText(String txt) {
        System.out.println("searching for a link txt = " + txt);
        return new Link();


    }


}
