package day24_loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int counter = 0;
        do {
            System.out.println("counter= " + counter);
        while (counter <= 1000);
        counter+=100;


    }while(counter <= 1000);
    }
}