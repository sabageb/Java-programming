package day53_inheretance.tesla;

public class ElectricCar {

    private String make;//make model price year =variable
    private String model;
    private double price;
    private int year;
    private int range;


    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
// model3.drive(34);
    protected void drive(int miles){

        if(range == 0 || range - miles < 0){
            System.out.println("ERROR: cannot drive that car, need to charge");

        }else {
            range-=miles;
            System.out.println("Driving" + miles + "miles.....");
        }


    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
