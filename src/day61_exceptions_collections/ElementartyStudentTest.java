package day61_exceptions_collections;

public class ElementartyStudentTest {
    public static void main(String[] args) {

        try{
            ElementaryStudent el1 = new ElementaryStudent();
            el1.setName("Bob");
            el1.setAge(1);
            System.out.println(el1.toString());
    }catch(
    Exception e){
            e.printStackTrace();//print ERROR STACK TRACE AND CONTINUE. DOES NOT STOP CODE

}
System.out.println("-----EXECUTION COMPLETED-------");

        }
        }

