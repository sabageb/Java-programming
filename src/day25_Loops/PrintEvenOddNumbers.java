package day25_Loops;

public class PrintEvenOddNumbers {
    public static void main(String[] args) {
        System.out.println("Even Numbers 0 - 100: ");


        for(int n = 0; n <= 100; n++) {
           if (n % 2 == 0) {
              System.out.print(n + " ");

            }
        }
        System.out.println("\nODD NUMBERS 0 - 100: ");
       for (int k=0; k<=100; k++){
            if (k % 2 != 0){
               System.out.print(k + " ");
            }
        }

    }
}