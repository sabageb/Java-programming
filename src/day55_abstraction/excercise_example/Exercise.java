package day55_abstraction.excercise_example;

public abstract class Exercise {
    public void start(){// non-abstract method
        System.out.println("Warming up and starting the exercise");

    }
  //abstract method with out body/implementation-just signature
    //purpose  letting sub class implement/override their own way
public abstract void perform();

    /**
     * another abstract method that concrete sub class will override/implement
      * @param minutes - how long is exercise is performed
     * @return number of calories burned/used
     */
    public abstract int getCaloriesCount(int minutes);



}
