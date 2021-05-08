package day15_Logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "los angeles";
        double salary = 120000;
        boolean isRemote = true;
        boolean hasBenefits = true;
        if (location.equals("Los Angeles") && salary >= 120000 && isRemote && hasBenefits){
      System.out.println("sure, I will accept this offer");
    } else {
        System.out.println("lets consider another offer or negotiate");


        }


    }
}