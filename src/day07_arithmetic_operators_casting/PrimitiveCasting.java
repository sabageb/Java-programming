package day07_arithmetic_operators_casting;

public class PrimitiveCasting {
    public static void main(String[] args) {
       int num1 = 100;
       byte b1 = (byte)num1;
       short shNum1 = (short)num1;
        long lNum1= num1;


        System.out.println(num1);
        System.out.println(b1);
        System.out.println(shNum1);
      System.out.println(lNum1);


        //byte has 1 memory value short=2; int= 4 ;long= 8; flaot= 4; double=8 char=2
    }

}
