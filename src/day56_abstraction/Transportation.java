package day56_abstraction;

public abstract class Transportation {

    public abstract void transportPeople();
    public abstract void cost(int mile);
    public void start(){
        System.out.println("Start the engeen");
    }
    public void stop(){
        System.out.println("shut off the engine");
    }
}
