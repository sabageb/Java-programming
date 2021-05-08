package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles";
        if (city.equals("Los Angeles")){
            System.out.println("It is Los Angeles");
        }else {
            System.out.println("It is NOT Los Angeles");
        }
   String weather = "sunny";
        //if (weather == "sunny"){<===it works, not error but avoid
        if(weather.equals("sunny")) {
        }else{
            System.out.println("lets go out and code java!");
            System.out.println();

        }


    }


}



