package day55_abstraction.interface_demo;

/**
 * interface keyword is used to create an interface
 */
public interface MyInterface {

    public abstract void learn();
}

 interface MyInterface2{

}
//class implement interface to inherit from it. it doesnt extend
//class can implement

//class can implement multiple interface and must
class MyClass implements MyInterface, MyInterface2{

    @Override
    public void learn() {
        System.out.println("Learning in MyClass");

    }
}
class Main{
    public static void main(String[] args){
      //  MyInterface myInterface= new MyInterface() ;ERROR CANNOT CREAT OBJECT OF INTERFACE

        MyClass myclass = new MyClass();
        }
    }
