package day48_constractors_staticc.static_examples;

public class CalculatorTest {
//STATIC WAY OF CALLING THE METHOD
    public static void main(String[] args) {
        // add is static method , can be called using Classname.staticMethodName
        Calculator.add(5,3);


      //  Calculator.multiply(2,4);ERROR: MULTIPLY IS NOT STATIC. NEED OBJECT TO CALL IT

        Calculator calculator = new Calculator();
        calculator.multiply(2,4);

        // static method
        // calcObject.add(10, 45);


    }
}
