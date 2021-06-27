package day57_abstraction_polymorphism.abstractClass_Vs_Interface;
//first non-abstract child class of Abstract class interface is called concrete class
// child of abstract and interface
// extended one abstract class and implement multi interface
public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB {

    @Override
    public void absMethodA() {

        System.out.println("absMethodA implementation is called ");

    }
@Override
    public void methodB(){

    System.out.println("MethodB overridden version is called");
}

    //@Override --> static methods are hidden
public static  void staticMethodC(){
    System.out.println("static method see hidden version is called ");
}

    @Override
    public void absMethodD(int num) {
        System.out.println("absMethodD overridden version is called - " );
    }
}
