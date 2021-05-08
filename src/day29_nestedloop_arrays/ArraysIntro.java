package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 10;// single variable
        //array variable
        int[] nums =new int[3];// or int nums[]=new int[3]
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;
        //print values of array
        System.out.println("value at index 0 = " + nums[0]);//index 0
        System.out.println("value at index 0 = " + nums[1]);

        System.out.println("value at index 0 = " + nums[2]);

        //we can also use int variavle to specify index number
int i =0;
        System.out.println(i);//5
        i++;
        System.out.println(i);//10

        //how to find out size of array
        int len=nums.length;
        System.out.println("len = "+len);
        // change value in the array
        nums[0]=100;
        nums[1]=300;
        //readd value of index 1 and assign same to index 2
        nums[2]=nums[1];

        System.out.println("nums[0] = "+ nums[0]);
        System.out.println("nums[1] = "+ nums[1]);
        System.out.println("nums[2] = "+ nums[2]);




    }
}
