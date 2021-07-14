package day58_polymorphism;

public class SuperMan extends Father implements Worker{


    @Override
    public void work(String job) {
        System.out.println("superman is working as " + job);
    }

    @Override
    public double getPaid() {
        System.out.println("SuperMan is getting paid");
        return 8000;
    }

    }

