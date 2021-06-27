package day57_abstraction_polymorphism.abstractClass_Vs_Interface;

public class Runner {
    public static void main(String[] args) {
        /**
         * we can not creat

        //  AbstractA absA = new AbstractA();
         //InterfaceA iA = new InterfaceA();

        */
        InterfaceA.staticMethodE("wooden spoon");
      //  ConcreteA.staticMethodE("hello"); -> staticMethodE only works with interface
        ConcreteA.staticMethodC();
    }
}
