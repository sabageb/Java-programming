package day54_abstraction;
/**
 *we add  abstract keyword to a class to make it an ablstract class.
 * we cannot create object of student class= meaning:
 * Student student  = new Student ();
 * -->what can we do with  this student class ? we can extend this class by sub clasess
 * Student class will parent class for all other types of student related classes
 */

public abstract class Student {
    public void code(String language){
        System.out.println("Student is coding using " +language);

    }
    // we can add abstract method into abstract class.
    // abstract method --> is created using abstract keyword
    //and does not have the implementation/method
public abstract void attendClass();

}





