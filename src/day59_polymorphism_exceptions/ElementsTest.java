package day59_polymorphism_exceptions;

public class ElementsTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.getText();
        link.sendKeys("hi");
        link.getlinkHref();

//this is polymorphism
        WebElement loginLink = new Link();
        loginLink.click();
        String txt = loginLink.getText();
        System.out.println("txt = " + txt);
        //loginLink.getLinkHref(); ERROR


        //polymorphism -->can only access what ever we have on webElement
        WebElement username = new InputField();
        username.sendKeys("wooden spoon");
        username.click();

        //polymorphic parameter
        WebElementUtil.clickElement(loginLink);
        WebElementUtil.clickElement(username);
     // WebElementUtil.clickElement(new String("hello"));String is not child of WebElement

        WebElement login = WebElementUtil.getLinkWithText("login");
        login.click();

        }
    }

