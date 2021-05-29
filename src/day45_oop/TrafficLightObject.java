package day45_oop;

public class TrafficLightObject {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight trafficLight=new TrafficLight();
      //  trafficLight.color ="red";// not good practice: dont do like this

        // we will assign/update the value of color using a method of the class
        trafficLight.changeColor("red");
       // System.out.println(trafficLight.color);//Direct access  to variable. NOT RECOMMENDED

        //call method to access the variable
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();


        TrafficLight trafficLight2 =  new TrafficLight();
        trafficLight2.changeColor("blue");
        trafficLight2.showColor();


    }
}
