package day52_inheretance;

public class Discord extends MobileApp {
    public void chat(String someone) {
        System.out.println("chatting with " + someone + " on Discord");

    }

    /**
     * override download method
     */

    @Override
    public boolean download() {
        System.out.println("download Discorded 0.0.23 from App store");
        return true;
    }


    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        chat("Vladislav");

}
public void printInfo(){
    System.out.println("App Name: " +getName());
    System.out.println("App Name: " +getVersion());
}
}
