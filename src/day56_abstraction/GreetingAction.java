package day56_abstraction;

public class GreetingAction {
    public static void main(String[] args) {


        MountainLanguage ml = new MountainLanguage();
        ml.hi();
        ml.bye();

        Greenting gt = new MountainLanguage();
        gt.hi();
        gt.bye();

        Japanise jp =new Japanise();
        jp.hi();
        jp.bye();

        gt= new Japanise();
        gt.hi();
        gt.bye();




    }
}