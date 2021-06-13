package day52_inheretance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp= new MobileApp();//object for parent class
        mobileApp.setName("youTube");
        mobileApp.useTheApp(10);
        mobileApp.download();


        Instatgram instatgram = new Instatgram();
        instatgram.setName("Instagram");
        instatgram.setVersion(5.3);
        instatgram.useTheApp(20);
        instatgram.download();


        Discord b22Discord = new Discord();
        b22Discord.setName("Discord");
        instatgram.setVersion(6.254);
        b22Discord.useTheApp(100);
        b22Discord.printInfo();
        System.out.println(b22Discord.getName());






    }
}
