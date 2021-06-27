package day56_abstraction.driavable;

public interface SelfDrivable {

    void autoPiloting();

    // void selfParks();this cause errorin sub class, bcz they must override abstract method
    public default void selfPark() {// if add default method it will prevent ERRORS
        System.out.println("performing selfpark steps");

    }


}
