package day47_constructors;

public class StudentObjects {
    public static void main(String[] args) {
        Student st1 = new Student();// no-args constructor
        Student st2 = new Student();//no-args constructor

        Student st3 =new Student("Burak");
        Student st4 = new Student("Alihan");

        Student st5 = new Student (5);
        Student st6 = new Student("Mike", 28);
    }


}
