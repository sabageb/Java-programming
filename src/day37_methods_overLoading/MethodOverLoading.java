package day37_methods_overLoading;

public class MethodOverLoading {
    public static void main(String[] args) {
        MethodOverLoading.sum(10, 5);
        sum(10.4, 12.4);
        sum(10, 5.5);
        //sum((int)4.2, 1, 2);
        sum("Hello", "world");
    }
    public static void sum(int num1, int num2){
    System.out.println("sum(int num1, int num2)");
    System.out.println("Result =" +(num1+num2));

}

public static void sum2(int num1, int num2, int num3){
    System.out.println("sum(int num1, int num2, int num3)");

    System.out.println("Result =" + (num1 + num2+ num3) );

}
public static void sum(double num1, double num2){
    System.out.println("sum(double, double)");
    System.out.println("result = " +(num1 +num2));
}
public static void sum(String str1, String str2){
    System.out.println("sum(string, string)");
    System.out.println("Result = "+ (str1 +str2));
}

}

