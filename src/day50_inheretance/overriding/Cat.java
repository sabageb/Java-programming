package day50_inheretance.overriding;

public class Cat extends Animal {
    public void jump() {
        System.out.println("Cat is jumping ... ");
    }

    @Override// override is optional
  public void speak(){

        System.out.println("Cat is saying Meow...");
        }
    }

