package day16_switch_ternary;

public class elevator1 {
    public static void main(String[] args) {


        int floorNum = 4;
        switch(floorNum){
            case 1:// if (floorNum==1){}
            System.out.println("Floor 1 selected. Companies: lobby verrizon");
            break; // exit switch

            case 2 :
                System.out.println("Floor 2 selected. Companies :Cybertek, NASA Intelsat");
                break; // exit the switch statement

            case 3 :
                System.out.println("Floor 3 selected. companies: lyft, BOFA, Stake house");
                break;
            default:
                System.out.println("Invalid floor - " +floorNum);

        }
    }
}
