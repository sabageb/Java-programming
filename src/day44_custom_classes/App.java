package day44_custom_classes;

public class App {
    /**
     *  attribute /data / instance variable
     *  App class is used as a templete for app objects.
     *  we describing app properies and behavior here. objects will be able to use them
     */


    String  name; // null by default
    double version;// 0.0 by default
    //open method is using name and version variable
    public void open(){
        System.out.println("opening "+ name + " app -version = " + version);
    }

}
