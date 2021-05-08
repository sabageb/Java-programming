package day11_comparison_operators;

public class BooleanComparisonOperators {

    public static void main(String[] args) {
        System.out.println(10==10);
        System.out.println("10==10");// sanity check

        System.out.println(1000>100);//true
        System.out.println(985.44<98547.8);//
        System.out.println(10<=10);
        System.out.println(10<=11);//10 is less than or equal to 11
        System.out.println(5>=3);// greater or equal
        System.out.println(100 != 44);//true -100 is not equal to 44
        System.out.println(-100!=44);//true -100 is not equal t
        // o 44

        int a= 100;
        int b = 200;
        System.out.println(a==b);// false
        System.out.println(a>b);//false
        System.out.println(a<b);//true
        System.out.println(a>=b);//false
        System.out.println(a<=b);//true
        System.out.println(a !=b);//true

        boolean result= 5==5;
        System.out.println("result = " +result);

        result = 33> 44;

        System.out.println("result = " + result);

result = 88 < 99;
        System.out.println("result " + result);
result = 10>=10;
        System.out.println("result " + result);

        result = 123 <= 124;
        System.out.println("result " + result);

        String city = "Seatle";
        System.out.println("city == " + city);

        //System.out.println("ciy == "Baku);
        String name = "nadir";
        boolean checkName = name == "nadir";
        System.out.println("checkName = " + checkName);


    }

}
