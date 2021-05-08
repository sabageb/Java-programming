package day07_arithmetic_operators_casting;

public class CastingExamples {
    public static void main(String[] args) {
        // byte- short- int - long/ small to ===> large
        byte num1 = 100;
        short num2 = num1;// (short)num1
        int num3 = num1;
        int num4 = 1000;
        long num5 = num4;
        //float  - double  // double is bigger thn float
        float num6 = 124.4f;
        double num7 = num6;




        int num8= 3456;
        double num9= num8;


         System.out.println(num8);
         // System.out.println("num9 = " + num9);//3456.0
        System.out.println("======================");

        int num10 = 22;
        byte num11 = (byte) num10;
        short num12 = (short) num10;// cast/convert to smaller==> convert short to smaller size so it can fit

        System.out.println("num10 = " + num10);
        System.out.println("num11 = " + num11);
        System.out.println("num12 = " + num12);


        double num13 = 55.3;
        float num14=(float) num13;

        System.out.println("num13 = " + num13);
        System.out.println("num14 = " + num14);

    double num15 = 1234.5;// double is big and you want to fit it to smaller which is int then u just add (int)
    int num16 = (int) num15;


        System.out.println("num15 " + num15);
        System.out.println("num16 " + num16);

int num17 = 300;
byte num18 = (byte) num17;
        System.out.println("num17 " + num17);
        System.out.println("num18 " + num18);

 char letter = 'M';
    int numletter = letter;
        System.out.println("letter " + letter);
        System.out.println("numLetter = " + numletter);//77

        char ch = 'j';
        int chnum = ch;

        System.out.println(chnum);//74
        System.out.println("chnum " + chnum);

        double d= 10.5;// if u cast decimal nr to whole nr , it will remove decimal point and value
        short sh = (short)d;
        System.out.println(sh);


        int num =(int)123.4;// printed only 123 and left out .4
        System.out.println(num);


    }

}