package day53_inheretance.final_keyword;

/**
 * TestData class that has a list of constant
 * Value of below variables cannot be charged anywhere
 */

public class TestData {
    public static final String ADMIN_USERNAME ="admin" ;
public static final String ADMIN_PASSWORD = "password123";
        public static final int MAX_WAIT_TIME = 60;
public  static final boolean STOP_IF_FAIL = true;


}
/**
 * ERROR: CAN NOT INHERIT FROM FINAL class
 */
//public Child extends TestData{

      //  }
