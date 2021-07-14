package day59_polymorphism_exceptions;

import day57_abstraction_polymorphism.shapes.Circle;
import day57_abstraction_polymorphism.shapes.Shape;
import day57_abstraction_polymorphism.shapes.Squire;

public class InstanceOf {
    public static void main(String[] args) {
        //instance of operator
        Shape shape = new Circle();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Squire);
        if (shape instanceof Circle){
            System.out.println("it is a Circle object ");


        }else if(shape instanceof Squire) {
            System.out.println(" it is a squire object");

        }
/**
 * java reflection API: https://odcs.oraclce.com/javase/tuterial/reflect/index.html
 */
//this is called reflection of API
        System.out.println(shape.getClass().getSimpleName());//just class name of object
        System.out.println(shape.getClass().getName());// class name of object and package name
        if (shape.getClass().getSimpleName().equals("square")){
            System.out.println("it is a square object");
        }
        System.out.println(shape.getClass().getDeclaredMethods().length);

        WebElement el = new Link();
        System.out.println("object class name of el variable = " + el.getClass().getSimpleName());
        //System.out.println(el.getClass().getDeclaredFields());
    }
}
