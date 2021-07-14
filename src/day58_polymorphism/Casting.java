package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {

//variable of worker and object of SuperMan
        Worker worker = new SuperMan();
        worker.work("QA manager");
        worker.getPaid();


        ( (Father)worker).raiseKid();
        ((SuperMan)worker).playWithKid();


        //dawnCasting from worker to superMan
        SuperMan superMan = (SuperMan) worker;
        superMan.feedKid();
        superMan.work("jsvs dev");
    }
}
