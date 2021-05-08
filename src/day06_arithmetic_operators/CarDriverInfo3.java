package day06_arithmetic_operators;

public class CarDriverInfo3 {
    public static void main(String[] args) {

        String carModel = "Dodge charger";
        String driverName = "Donald Trump";
        String licenseNumber = "B123584";
        Short speed = 55;
        boolean isAutomatic = true;
        char licenseClass = 'B';

System.out.println("Car model : "+ carModel);
//Dodge charger is car model
System.out.println(carModel+ " is car model.");
System.out.println("Driver name:" + driverName);
//System.out.println(driverName + " is driving a car);

//Donald Trump is driving Dodge charger
        System.out.println(driverName+ " is driving "+ carModel);
        //Current speed is 55
System.out.println("Current speed is: " + speed + "mph");


      System.out.println("is car automatic -> "+ isAutomatic);
      System.out.println(licenseClass+" - "+ licenseClass);


    }
}
