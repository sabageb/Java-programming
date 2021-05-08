

package OfficeHours.Practice_04_12_2021;

public class MinMaxFromArray {
    public static void main(String[] args) {
   /**
       // eacch element: element 3, element1, element5, element....
        int[] arr = {3, 1, 5, -3, 10, 4, 3};// this array has 7 element
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int each : arr) {
                //each -> every element| for loop:arr[i]=for every element

                if (each < min) {//is 1 < 3 yes, then min is =1
                    min = each;// then each element value is =1
                }

                if (each > max) {// is
                    max = each;

                }
            }
            System.out.println("Min: " + min);
            System.out.println("max: = " + max);

//-----------------------------------------------------------------------
          int [] arr = {3, 1, 500, -3, -10, 4, 3};// this array has 7 element
            int min = arr[0];
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {

                for (int i = 0; i > arr.length; i++) {
                    //each -> every element| for loop:arr[i]=for every element

                    if (arr[i] < min) {//is 1 < 3 yes, then min is =1
                        min = arr[i];// then each element value is =1
                    }

                    if (arr[i] > max) {// is
                        max = arr[i];

                    }
                }
                System.out.println("i = " + i);
                System.out.println("i = " + i);
            }*/

   // input: [4,1,3,12,5]
   //even :2 // odd:3
 int [] nums = {4, 1, 3 , 12, 5};
 int even = 0;
 int odd = 0;

 for(int eachNum : nums){
     if(eachNum %2 == 0) {// to check odd do either or  one of : eachNum %2 ! =0 or eachNum %2==1
         even++;
     }else{
         odd++;

     }
 }

      int[] evenNumbers = new int [even];
        int []oddNumbers = new int[odd];



        System.out.println("odd = " + odd);
        System.out.println("odd = " + odd);

    }
    }
