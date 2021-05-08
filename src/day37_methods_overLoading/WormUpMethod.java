package day37_methods_overLoading;

public class WormUpMethod {
    public static void main(String[] args) {
        loginVoid("CybertekStudent", "abc123");// posetive test//SUNNY DAY
        loginVoid("cybertek", "answer");// negative test//RAINY DAY
        loginVoid("","");
        //System.out.println(loginVoid("CybertekStudent", "abc123"));//error -void no return value
        System.out.println(login("CybertekStudent", "abc123"));

        if(login("CybertekStudent", "abc123")) {
            System.out.println("login successful , welcome to Canvas");
            System.out.println("select the course to continue");
        }else{
            System.out.println("login failed");
        }
    boolean isLoginSuccess = login("nadir", "mountain");
        System.out.println("isLoginSuccess = " + isLoginSuccess);

        if(login("nadir", "mountain")) {
            System.out.println("welcome to canvas, select course or calender");
        }else {
            System.out.println("something wrong with your credentials");
        }
//String ret = System.out.println("hello");//ERROR it is void
    }
        public static void loginVoid(String userName, String password) {
            String secretUserName = "cybertekStudent";
            String secretPassword = "abc123";

            if(userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {

                System.out.println("login successful, welcome CybertekStudent!");
            }else {
                System.out.println("Incorrect username or password");
            }

    }

    public static boolean login(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        //return userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword);
        if(userName.equalsIgnoreCase(userName) && password.equals(secretPassword)){
            return true;// return value  and exit method here return false will not run

        }
        return  false;
    }
}