package day32_arrays_split;

public class MallShopping {
    public static void main(String[] args) {
        //                     0        1           2           3       4       5
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("---------FIND THE first INDEX OF 'Gloves' IN ITEM ARRAY------------------");
        // use for loop with condition
        int indexOfGloves = -1;

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves found at index " + i);
                break;
                // System.out.println(i + " - " + items[i] );
            }
        }

        System.out.println("------------set boolean to true if first 'ipad' is found");
        boolean iPadExists = false;

        for (String item : items) {
            if (item.equalsIgnoreCase("iPad")) {
                iPadExists = true;
                break;
            }
        }
        System.out.println("iPadExits = " + iPadExists);
        if (iPadExists) {
            System.out.println("we bought the ipad !!");
        } else {
            System.out.println("we forgot the ipad! : (");
        }

        System.out.println("------------print a report of each shopping item---------");
        /**
         * shoes -$99.99 - # 12345
         * ......
         * iphone 12 case - $39.99 - 12350
         *
         */

        for(int i=0; i<items.length; i++){
            System.out.println(items[i]+" -  \t$"+ prices[i] +" - #"+itemIDs[1]);
        }
        System.out.println("********Look for 'jacket' in items and print all details*********");
        /*
         * jacket - $150.0 - #12346
         */
    for (int i=0; i<items.length; i++){
        if(items[i].equalsIgnoreCase("Jacket")){
            System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i] );
            break;// stop searching after jacket is found
        }
    }



    }
}