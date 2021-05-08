package day40b_reviewClass;

public class SumOfNumbers {
    public static void main(String[] args) {

        System.out.println(getSumFromString("a5bc12def100g"));
//e//ex: a5bc12def100g
    }

    public static int getSumFromString(String str) {
        int sum = 0;
        String num = "";//12
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {// check if every charcter is a number(digit)


                num += str.charAt(i);
                sum += Integer.parseInt(num);
                num = "";// resets our String for the number

            }
        }


            return sum;


        }
    }
