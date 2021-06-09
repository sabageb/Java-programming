package day51_inheritance.super_Keyword;

import java.awt.*;

public class EmployeeObjects {
    public static <Contractor> void main(String[] args) {
        Employee developer = new Employee();
        developer.jobTitle = " Java Developer";
        System.out.println("developer.calculateSalary(55.0) = " + developer.calculateSalary(55.0));
        double annualDevSalary = developer.calculateSalary(65.0);
        System.out.println("annualDevSalary = " + Math.round(annualDevSalary));


        Contractor sdetContractor = new Contractor();
        sdetContractor.jobTitle = "SDET";
        double sdetSalary = sdetContractor.calculateSalary(55.0);
        System.out.println("sdetSalary = " + sdetSalary);

        System.out.println(developer.toString());// even if we dont write to string there is stll tostring behind
        System.out.println(sdetContractor);





    }
}
