package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress = new Address();// calling the constructor automatically
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipcode("22182");

        System.out.println("cybertekSchool address: " + cybertekAddress.toString());
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3200");

        System.out.println("address after update = " + cybertekAddress);
        System.out.println("street info = " + cybertekAddress.getStreet());

        Address newAddress = new Address();// when ever we said new the constructor will run- constractor is under address class
        newAddress.setStreet("7921 Jones branch dr suite 200");
        newAddress.setCity("McLean");
        newAddress.setState("VA");
        newAddress.setZipcode("22182");
        System.out.println(newAddress.toString());

        // same as line 17 to 22 BUT 1 line instead
        Address papaJohnPizza = new Address("8501 tyco Rd Ste 1A", "Vienna", "VA", "22182");
        System.out.println("papa John pizza = " + papaJohnPizza.toString());
    }


}
