package day60_Exceptions;

public class ThrowingException {
    public static void main(String[] args) {


        System.out.println("lets create exceptions");
        //        RuntimeException e = new RuntimeException();
//        throw e;
        //creating problem -we are saying to java hi lets stop
        //we do this if we want the test to fail

        // throw new RuntimeException();
        String userName = "";
        if (userName.isEmpty()) {
            throw new RuntimeException("Username cannot be empty");
            //Assert.fail("reason message .. ");
        }
    }


}






