package day25_Loops;


public class WhileHungry {
    public static void main(String[] args) {

        // it takes 3 bananas for isHungrey to be set to false
        // while hungry eat banana 1
        //when bananas reach countToFull set hungry to false
        //increase banana by 1


        boolean isHungry = true;
        int bananas =0;
        int countToFull= 3;

        //while (isHungry || bananas !=countToFull)

        while (isHungry){
            bananas++;
            //System.out.println("Eating a a banana: \uD83C\uDF4C " +bananas);
            System.out.println("Eating a a banana: \u001B[36m\uD83C\uDF4C \u001B[0m" +bananas);

            //isHungry = bananas== countToFull? false : true;
            if(bananas==countToFull){
                isHungry=false;
            }
        }
        System.out.println("had enough bananas, lets get back to studying");





    }
}
