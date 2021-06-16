package day54_abstraction;
//abstract keyword is used to create an abstract class in java
public abstract class MyAbstractClass {
    int num =55;
    public void learn(){

         System.out.println("learning....");
     }
//abstract method with no implementation
//just the signature it only
public abstract void close();

}
// this is the how part
class Sub extends MyAbstractClass{



    public void close(){
    System.out.println("Close  =  abstract method implementation");

}

}
class MyObject{
    public static void main(String[] args) {
       // MyAbstractClass mac = new MyAbstractClass();
        Sub sub = new Sub();
        sub.learn();
        System.out.println(sub.num);
        sub.close();

    }
}