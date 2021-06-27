package day56_abstraction;

import day56_abstraction.driavable.Plane;
import day56_abstraction.driavable.SelfDrivable;
import day56_abstraction.driavable.Tesla;
import day56_abstraction.driavable.Transportation;

public class DriavableTesla {
    public static void main(String[] args) {
        Tesla model3 = new Tesla();
        model3.hi();
        model3.transportPeople();
        model3.autoPiloting();
        model3.cost(25);
        model3.stop();
        model3.bye();


        Plane plane =new Plane();
        plane.start();
        plane.hi();
        plane.transportPeople();
        plane.autoPiloting();
        plane.cost(150);
        plane.bye();
        //plane.land();
        plane.stop();


        //polymorphism
        SelfDrivable sd = new Plane();
        SelfDrivable sd2 = new Tesla();

        Transportation tp1 = new Plane();
        Transportation tp2 = new Tesla();


    }
}
