package day58_polymorphism;

public class Amazon extends OnlineShopping implements Prime{
    @Override
    public void buy() {
        System.out.println("buying item on amazon.com");
    }

    @Override
    public void sell() {
        System.out.println("selling items on amazon.com");

    }

    @Override
    public void ship() {

    }

    @Override
    public void primeShipping() {
        System.out.println("free - 2day shipping for prime users");

    }
}
