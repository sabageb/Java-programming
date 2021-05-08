package day37_methods_overLoading;

public class VarArgs {

    public static void main(String[] args) {

        addNumbers(10,5);
        addNumbers(100, 200, 300);
        addNumbers(10,23, 58, 54 ,589, 12 , 136 , 457 ,665,5454, 369,1 ,3 , 58);
        addNumbers();
        //int ...myNumber=10, 4; ERROR, var-args can ONLY be use as a method parameter
    }
    public static void addNumbers(int... nums){
        //inside the method, it is used as regular array
    int sum =0;
    for(int n: nums){
        sum+=n;

    }
    System.out.println("sum = "+ sum);

    }
}
