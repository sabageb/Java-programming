package day24_loops;
import java.util.Scanner;// mac:option+enter/windows:alt+enter
public class GiveMe5$ {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int dollars = scan.nextInt();

        System.out.println("Give me 5 dollars");
        dollars = scan.nextInt();

        while (dollars != 5) {

            System.out.println("give me 5 dollars");
            dollars = scan.nextInt();

            System.out.println("thank you for 5 dollars");
        }


    }
}


