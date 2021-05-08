package day19_class_vs_object_string;

import java.time.Instant;

public class LoginTest {
    public static void main(String[] args) {
// user name is not case sensetive-use dot. equals /
        String expUserName = "cybertek";
        String expPassword = "Abc123";

        String userName ="CYBERTEK";
        String password = "abc123";

        if(expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)) {
            System.out.println("Pass - user logged in successfully" + Instant.now());

        }else {
            if(!expUserName.equalsIgnoreCase(userName)) {
                System.out.println("fail - username is incorrect");
            } else {
                System.out.println("fail- password is incorrect");

            }

        }

    }
}
