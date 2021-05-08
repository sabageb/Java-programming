package day25_Loops;

public class SumOfNumbers {
    public static void main(String[] args) {

        int sum =0;//
        //0+1+2+3+4+5
        int count = 1;

        for(int i=1; i<=1000; i++ ){
            System.out.println(i);
            sum+= i;// means add all together sum= sum + i
        }
        // out side of the loop we print sum
        System.out.println("sum = " + sum);// here gives u the added value
   
    }
    
}
