package day44_custom_classes;


/**
 * this class is used
 */
public class MyApps {
    public static void main(String[] args) {
        // String app1 = " uber" ; this is string object. just characters
        String app1 ="uber";
        App uberApp = new App();
uberApp.name = "uber";
        uberApp.version = 3.5;
        uberApp.open();//call open method using object  variable


    }
}
