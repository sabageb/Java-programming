package day59_polymorphism_exceptions.exception_handling;

public class SwallowingException {
    public static void main(String[] args) {
            try {
                System.out.println("hello");
                System.out.println(5 / 0);
            }catch (Exception ignore){}

            System.out.println("how are today?");
            System.out.println("We just suppressed / swallowing the runtime Exception");// saying to java dont worry if u find error
            System.out.println("Error is not reported, we just ignore it");

        }
    }
    
