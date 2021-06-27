package day56_abstraction.driavable;


import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void hi() {
        System.out.println("hello hello");
    }

    @Override
    public void bye() {
        System.out.println("Bye bye");

    }

    @Override
    public void autoPiloting() {
        System.out.println("Flying on Auto-pilot mode");

    }

    @Override
    public void transportPeople() {
        System.out.println("Flying people from one city to another");

    }

    @Override
    public void cost(int mile) {
        System.out.println("plane cost  " + (mile * 25.0) + "to fly " + mile+ "miles");

    }
}
