package day30_arrays;
/**id index -0
 * firstname index 1
 * lastname index 2
 * batchNum index 3
 * phoneNum index 4
 * delare student array and store 5 String values
 */
public class StudentArray {
    public static void main(String[] args) {

       // String [] student1 = {"1234", "Adam"};
            String [] student1 = new String[5];// use when u have info not in ur hand
            student1[0] = "AD1234";
            student1[1] = "Adam";
            student1[2] = "Smith";
            student1[3] = "B22";
            student1[4] = " 202- 543-1234";
           String[] student2= {"Mke4421", "Mike", "Bloomberg", "B22", "703-432-1234"};
        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstname = " + student1[1]);
        System.out.println("student1 lastName = " + student1[2]);
        System.out.println("student1 batch num = " + student1[3]);
        System.out.println("student1 mobile num = " + student1[4]);

        System.out.println("student date length : " + student1.length);// how many item
        /**  check if student1 data array contain 5items
        true student1 data array has correct length
        false  fail :data array has incorrect length   */
if (student1.length == 5){
    System.out.println("Pass data arrays correct length");
}else {
    System.out.println("fail: student data array has incorrect length");

}
        /** check if student1 and sudent2 arrays have same number of data
         * true : pass: data array length match
         * false : fail: data array mismatch
         */
        if(student1.length == student2.length) {
            System.out.println("pass: data arrays length match");
        }else {
            System.out.println("Fail: data arrays length mismatch");
            /**  read from array and print first and last name in all uppercase
             */
        }                        //"Adam"--->"ADAM                "Smith--> "SMITH"
        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());
        // read mobile from array  and store into variable
        String mobileNum = student1[4];
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("202"));


    }
}
