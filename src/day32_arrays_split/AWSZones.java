package day32_arrays_split;

public class AWSZones {
    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("---------Start deployment of etsy app AWS zones--------");
String[] zonesToDeploys = zones.split(",");
for( String eachZone: zonesToDeploys){


    System.out.println("Deploying["+app+"] to " + eachZone +".....");
    System.out.println("deployment completed for " + eachZone + "......");
    //System.out.println(eachZone);

}
      //  System.out.println("--------all deployments completed for" + eachZone);

    }
}
