package day25_Loops;

public class PrintStars {
    public static void main(String[] args) {
        // using for loop print 15 stars in same line

        for (int stars = 1; stars <= 15; stars++) {
            // System.out.print("* ");
            System.out.print("\uD83C\uDF1F * ");

        }
        System.out.println();// start new line
        String myStars = "";
        //for loop :fill 5 stars to myStars variable
        myStars += "* ";
        myStars += "* ";
        myStars += "* ";
        myStars += "* ";
        myStars += "* ";
        myStars += "* ";
        System.out.println("my stars =" + myStars.trim());


        myStars = "";
        for (int i = 1; i <= 5; i++)
            // myStars = myStars + "* "

            myStars += "* ";
        System.out.println("* ");
        System.out.println("my stars = " + myStars.trim());//* * * * *

myStars = "";
for(int i =1; i <=5; i++){
    myStars+="* ";
}
        System.out.println("my stars = " + myStars.trim());

    }
}
