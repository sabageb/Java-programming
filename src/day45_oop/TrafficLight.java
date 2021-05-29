package day45_oop;

public class TrafficLight {
    String color;

    // this is read only method , displaus value of color variable
    public void showColor() {//read me the color u see
        System.out.println("Current color = " + color);

    }
    //this method update the value of color variable
public void changeColor (String newColor) {//change the color i m asking u to
        if (newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("yellow") ||
                newColor.equalsIgnoreCase("green")) {
            System.out.println("changing color to " + newColor);
        color = newColor;

    }else {
            System.out.println("ERROR: Invalid color:" + newColor);
        }
}

}
