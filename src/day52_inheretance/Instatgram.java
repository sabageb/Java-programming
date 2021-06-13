package day52_inheretance;

public class Instatgram extends MobileApp{
    public void postPhoto(){
        System.out.println("posting photo on Instagram");


    }
    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);// super bring it to parent class
        System.out.println("using instagram app features ");
        postPhoto();


    }
}
