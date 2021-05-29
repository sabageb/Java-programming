package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {

        Car car1 = new Car();
        //car1.model = "NISSAN ALTIMA";
        car1.setModel("Nissan Ultima");

        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(2020);
        System.out.println("car1  year = " + car1.getYear());
        car1.setMilage(45258);
        System.out.println("car1 milage = " + car1.getMilage());
        System.out.println(car1.toString());
        System.out.println(car1);// automatically calls toString
        Car alfaRomeo =  new Car();
        alfaRomeo.setModel("alfa Rome Guila ti awd");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMilage(16604);

        System.out.println("modelo = " + alfaRomeo.getModel());
        System.out.println("year  = " + alfaRomeo.getYear());
        System.out.println("mileage = " + alfaRomeo.getMilage());


    }

}
class Car {
    //encapsulation/ hidden insurance variable
    private String model;
    private int year;
    private int milage;

    //setter method for model
    public void setModel(String carModel) {
        model = carModel;

    }
//getter method for model
    public String getModel() {

    return model;

    }
//setter for year
    public void setYear(int year){
       this.year = year;

    }

    //getter for year
    public int getYear() {
        return year;
    }
//getter setter for milage
    //generate toString

    //setter for milage -will have parameter
    public void setMilage(int milage) {
        this.milage = milage;
    }

    //getter method for milage
    public int getMilage() {
        return milage;// this.milage will also work

    }
   public String toString() {
        return "Car{" + "model=' "+model+""+"year="+year +"milage="+milage+'}';


   }
}
