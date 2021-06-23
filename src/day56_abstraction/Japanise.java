package day56_abstraction;

public class Japanise implements Greenting{
    @Override
    public void hi() {
        System.out.println("こんにちは");
    }

    @Override
    public void bye() {
        System.out.println("さようなら");

    }
}
