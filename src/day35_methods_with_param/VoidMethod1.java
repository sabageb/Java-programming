package day35_methods_with_param;

public class VoidMethod1 {

    public static void main(String[] args) {
        printAtoZ();
        printAtoZ();
    }
    public static void printAtoZ(){
        for (char i= 'A'; i<= 'Z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
