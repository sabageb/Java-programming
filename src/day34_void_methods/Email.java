package day34_void_methods;

import java.util.Locale;

/**
 * @params/inputs:string name, string domain
 * build email("saim", "cybertekschool");
 * ===>saim@cybertec=kschool.com
 */
public class Email {
     public static void main(String[] args) {

buildEmail("Nadir", "FannieMae");
buildEmail("john ward III", "verizon");


}

        public static void buildEmail(String name , String domain) {
         name = name.replace(" ","_").toLowerCase();
         domain = domain.toLowerCase();
            String email = name + "@"+ domain + ".com";
            System.out.println(email);
            //System.out.println(email==email);





            }

            }



