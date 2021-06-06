package day46_encasulation;

public class dealership {
    public static void main(String[] args) {

        Car car1 = new Car();
        //ERROR BELO A DIFFERENT CLASSW ,MODEL AND YEAR ARE PRIVATE AND CAN NOT BE ACCESSED FRO
        //car1.model ="Nissan Ultima";
        //car1.year = 2020;
        car1.setModel("Nissan Ultima");
        System.out.println("car1 model= " + car1.getModel());

car1.setYear(2020);
        System.out.println("car1  year = " + car1.getYear());
        car1.setMilaage(3445);
        System.out.println("car1 mileage= " + car1.getMilaage());
    }

}
