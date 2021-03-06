package day56_abstraction.driavable;

import day56_abstraction.greeting.Greeting;

public class Tesla extends Transportation implements SelfDrivable, Greeting {

    @Override
    public void transportPeople() {
        System.out.println("tesla is transporting people on the road");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla cost " + (mile * 0.10) + "to drive " + mile + " miles ");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Tesla is driving on autonomous mode");

    }

    @Override
    public void hi() {

        System.out.println("Tesla is saying 'hello hello peep peep'");
    }

    @Override
    public void bye() {

        System.out.println("bye bye charge me charge me");
    }
}
