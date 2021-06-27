package day57_abstraction_polymorphism.abstractClass_Vs_Interface;

public interface InterfaceA{
    //interface can ONLY have PUBLIC STATIC FINAL version
    public static final String TYPE = "interface";
    double MAX_COUNT = 500;//this also public final

    public abstract void absMethodD(int num);
    /**
     * ERROR : interface CANNOT HAVE constructor
     * public InterfaceA(){
     *    // System.out.println("constructor is not welcome in interface");
     *    }
     */


    /**
     * Starting from java 8 (jdk 1.8)
     * interface can have static and default methods
     *
     */
    public static void staticMethodE(String str){
        System.out.println("staticMethodE is called with str - " + str);
    }

public default void defaultMethodF(){
    System.out.println("defaultMethodF is called ");
}


}
