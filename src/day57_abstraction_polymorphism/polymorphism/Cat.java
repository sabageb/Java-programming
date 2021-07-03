

package day57_abstraction_polymorphism.polymorphism;

import day44_custom_classes.Animal;

public class Cat extends Animal {
    @Override
    public void makeNoise(){
        System.out.println("Cat is saying <meow meow>");
    }


}
