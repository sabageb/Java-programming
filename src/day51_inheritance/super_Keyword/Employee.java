package day51_inheritance.super_Keyword;

public class Employee extends Object {

    String jobTitle;

    public double calculateSalary(double hourlyRate){
        return 52 * 40 * hourlyRate *1.1;

    }
//toStrring method is inherited from object class
    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }


}
