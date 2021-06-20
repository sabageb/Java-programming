package day55_abstraction.excercise_example;

public class FreeWeight extends Lifting{
    @Override
    //these method are being overridden that are from exercise abstract class
    public void perform() {
        System.out.println("Perform");

    }

    @Override
    //these method are being overridden that are from exercise abstract class
    public int getCaloriesCount(int minutes) {
        return 0;
    }

    @Override
    public void endLift() {

    }
}
