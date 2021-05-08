package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum1 = 1;

        if (floorNum1 == 1) {
            System.out.println("Floor 1 selected. Companies: Lobby, verizon, starbucks");


        } else if (floorNum1 == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek,NASA, Intelsat");

        } else if (floorNum1 == 3) {
            System.out.println("Floor 3 selected. Companies : lyfte , bofa, stake house");
        } else {
            System.out.println("Invalid floor");
        }
    }
}
