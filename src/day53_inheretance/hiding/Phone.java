package day53_inheretance.hiding;

public class Phone {
    String type= "Old school phone";


    public static void use(){
        System.out.println("Using the phone");
    }
public void call() {
        use();
    System.out.println("and making a phone call ");
}


}
