package day38_methods;

public class Recursive_Method {
    public static void main(String[] args) {
        printNums(1);

    }
public static void printNums(int num) {
    System.out.print(num + " ");
    num++;
    if (num <= 100) {
        printNums(num);

    }
}
}
