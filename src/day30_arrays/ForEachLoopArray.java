package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {

        int [] data = {32, 12, 5454, 22, 123, 543, 999, 321, 3};
        for( int eachNum :data ){// goes only forward not back ward
            System.out.println(eachNum);

        }
for(int n : data){
    System.out.print(n + " ");

}
   //repeat above with for loop
        System.out.println("---------------FOR LOOP-------------------");


     for (int i=0; i<data.length; i++){// we can do every other or every 3rd nr to print
         System.out.println(data[i]);
     }
// print last value in array index using length-1
        //                          10-1=9
        System.out.println("last value : " + (data.length -1));

     // print all numbers back ward in same line
     for( int idx = data.length - 1; idx >= 0; idx--){
         System.out.print(data[idx] + " ");
     }

        }
    }

