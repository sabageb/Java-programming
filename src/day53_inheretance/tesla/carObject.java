package day53_inheretance.tesla;

public class carObject {
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Tesla","model y",48190.0,2021, 326);
        ec1.drive(50);
        System.out.println(ec1.toString());

    }
}
