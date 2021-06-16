package day54_abstraction;

/**
 * OnlineStudent class will extend student abstract class
 * This class is considered to be concrete class
 * It is responsible to implement all abstract methods(if any)
 */
public class OnlineStudent extends Student {
    /**
     * abstract abstract method is implemented by the sub class
     * Sub class is overriding the abstract method of parent class
     */

    @Override
    public void attendClass() {
        System.out.println("online student is attending class using zoom");
    }
//public abstract void askQuestion(); ERROR - ABSTRACT METHOD


}
