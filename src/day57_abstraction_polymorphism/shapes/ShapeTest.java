package day57_abstraction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();
        Shape circle = new Circle();
        circle.draw();
        Shape squire =new Squire();
        squire.draw();

        /**
         * single variable of parent type, and different objects of child types
         */

        Shape shape = new Triangle();
        shape.draw();
        Shape shape1= new Circle();
        shape.draw();
        shape=new Squire();
        shape.draw();


        /**
         * create list of shapes and store 10 different shapes
         * using a loop print out each shape
         */

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle());
        shapes.add(new Squire());
        shapes.add(new Circle());
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Circle());




        //System.out.println(shapes);print Hashcodes of objects
        for(Shape eachShape : shapes){
            eachShape.draw();
        }

        drawShape(new Circle());
        drawShape(new Squire());
        drawShape(triangle);
    }

/**
 * static method: drawShape
 * accepts object of shape
 * then calls draw() method
 *
 */
public static void drawShape(Shape shape){
    System.out.println("-------Draw shape----------");
    shape.draw();

}

}
