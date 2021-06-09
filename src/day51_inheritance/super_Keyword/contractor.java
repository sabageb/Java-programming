package day51_inheritance.super_Keyword;

public class Contractor extends Employee {
    //overloading - has same name calculatorSalary

    @Override// 1) lets everyone know that you are overriding this method
            //2) ensures that this method is being overridden. if not it shows ERROR.
    public double calculatorSalary(double hourlyRte) {
        return 50 *40 * hourlyRte;


    }

}
