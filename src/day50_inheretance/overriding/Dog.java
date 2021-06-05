package day50_inheretance.overriding;

public class Dog extends Animal{

    public void run(){
        System.out.println("Dog is running  .... ");

    }

    @Override
public void speak(){
    System.out.println("Dod is barking ruff woof");
}


}
