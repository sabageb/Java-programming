package day53_inheretance.hiding;

public class Mobile extends Phone {

    String type = "mobile phone";

    /**
     * Method hiding.
     * we are hiding use() static Method
     */
    public static void use(){
        System.out.println("Using mobile phone");

    }
public void text(){
        use();
    System.out.println("and sending a text message");
}

@Override
    public void call(){
        use();
    System.out.println("and calling on mobile");
}
}
