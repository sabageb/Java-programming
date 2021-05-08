package day35_methods_with_param;
public class VoidMMethods {
    public static void main(String[] args) {

        displayUSFlag();
        System.out.println("======================FLAG OF USA=====================");
        displayUSFlag();
    }

    public static void displayUSFlag() {
        System.out.println("==============Flag OF USA============================");

        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }


    }
}

