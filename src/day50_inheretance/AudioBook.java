package day50_inheretance;

public class AudioBook extends Book{

    int length;
    String narrator;


    public void listen(){
        System.out.println("Listening to audioBook");
        System.out.println("title = " + title);
        System.out.println("author  = " + author);
        System.out.println("type = " + type);
        System.out.println("price = " + price);

    }


}
