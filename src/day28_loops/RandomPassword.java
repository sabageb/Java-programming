package day28_loops;
import java.util.Random;
public class RandomPassword {
    public static void main(String[] args) {

        String source = " ABCDEFGIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
String password="";
        //how many char for password:8
        Random random = new Random();
        for (int i = 1; i <= 8; i++) {
            int index = random.nextInt(71);//random num 0-70
            System.out.print(source.charAt(index));
         //  System.out.println(random.nextInt(21));
//password = password + source.charAt(index);
password+=source.charAt(index);
        }

        System.out.println("\nyour password = " + password);

    }
}