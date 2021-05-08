package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(5.2,20.0));
        double sum = add(1, 3);
        System.out.println("sum = " + sum);
        System.out.println("100.0 + 200.0 = "+ add(100, 200));

        System.out.println(minus(10,3));
        System.out.println(multiply(2,10));
        System.out.println(divid(400,5));
    }
    public static double add(double num1, double num2){
        double result = num1 + num2;
        return result;
        }
public static double minus(double num1 , double num2){
        double subtractNum= num1-num2;//same as: double result =num1 -num2
        return subtractNum;//return result
}

public static double multiply(double num1, double num2){
        double multiplyNum= num1*num2;// double result = num1*num2
        return  multiplyNum;//same as: return result
}
public static double divid(double num1, double num2){
        double divideNums= num1/num2;//same as: double result = num1/ num2
        return  divideNums;// same as: return result
}

}

