package QUIZ;

import java.util.*;
class test {
    public static void main(String[] args) {


/**

        int[] arr = {1, 2, 3, 4};
        int i = 0;
        do {
            System.out.println(arr[i] + " ");
            i++;
        } while (i < arr.length - 1);


        String[] planets = {"mercury", "venus", " earth", "mars"};
        int x = planets.length;
        int y = planets.length;
        System.out.println(x + " " + y);


        int[] intArr = {15, 30, 45, 60, 75};
        intArr[2] = intArr[4];
        intArr[4] = 90;
        System.out.println(Arrays.toString(intArr));


        int[] num1 = new int[3];
        int[] num2 = {1, 2, 3, 4};
        num1 = num2;

        //for (int i = 0; i < num1.length; i++) {

            System.out.println(num1[i]);
        }



        int n= 0;
        String[] days= {"sun", "mon","wed","say"};
        for(int i=0; i< da
        Arrays.sort(array);

        for(char each : array){

            }
        }


*/



    //String[] strs ={"display", "population"," meeting","copy", "franchise"};
    //int a= strs.length;
  //  int b= strs[5].length();
//        System.out.println(a+ " " + b);

//byte []b={1,2,3};
//for (int j=0; j< b.length; j++){

  //  b[j] = (byte) (b[j]) *2);


        //System.out.println(Arrays.toString(b));

        int [] nums= {14,1,84,97,1243,46};
        int total =0;
        for (int i=0; i< nums.length; i++){
            if(nums[i] %2 !=0) {
                total += 5;
            }else {
                total+=10;

            }
        }
        System.out.println(total);

        String []things ={"house", "she", "slide","zebra","park","garden"};

        for(String  s: things){
            switch (s.charAt(1)){
                case  'h':
                    System.out.println(1);
                    break;
                case 'a':
                    System.out.println(2);
                    break;
                case 's':
                    System.out.println(3);
                    break;
                case '0':
                default:
                    System.out.println(4);
                    break;
                case 'p':
                    System.out.println(5);
                    break;
                case 'z':
                    System.out.println(6);
                    break;
                case 'l':
                    System.out.println(7);
                    break;
                case 'g':
                    System.out.println(8);
            }
        }

    }
}

















