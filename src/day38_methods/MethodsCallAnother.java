package day38_methods;

public class MethodsCallAnother {

    public static void main(String[]args){
    start();
    continues();

}
    public static void start(){
        System.out.println("start");
        continues();
}
public static void continues(){
    System.out.println("continue");
    ends();
}
public static void ends(){
    System.out.println("end");
}

}
