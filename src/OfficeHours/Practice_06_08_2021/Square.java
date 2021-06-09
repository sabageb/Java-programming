package OfficeHours.Practice_06_08_2021;
// here we are passing all info from shape to square- inherited
//child class

public class Square extends Shape {

    double side;

    @Override
    public void calculateArea() {
        area = side * side;

    }
        @Override
        public void calculatePerimeter () {
            perimeter = side * 4;
    }


    @Override
    public String toString() {
        return "Square{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}


