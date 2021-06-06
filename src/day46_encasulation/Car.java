package day46_encasulation;

public class Car {
//encapsulate/hidden instatance variable
    private String model;//private is access modifier
    private  int year;
    private int milaage;
    ////setter method model

    public void setModel(String carModel) {

    }
    //getter method for model
    public String getModel() {
        return model;
    }

//setter for year
    public void setYear(int year) {
        this.year = year;

    }
//getter for year
    public int getYear(){
        return year;
    }

    //setter for mileage-->myCar.setMileage(2345)--->setter has parameter
    public void setMilaage(int milaage){
       this.milaage = milaage;
    }
  //getter for mileage
  public int getMilaage(){
        return milaage;

  }




}
