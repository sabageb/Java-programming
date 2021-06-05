package Practice_06_01_2021;

/*
-create a class called Tester
        Attribute:
        name, employeeID, JobTitle, Salary

        Constructor:
        accepts and sets all instance variable

        Actions:
        getter/setters, smokeTesting(), creatingTicket(), toString


        -> Optional: static variable
 */

public class Tester {

    private String name;
    private int employeeID;
    private String jobTitle;
    private double salary;


    // constructor
    public Tester(String name, int employeeID, String jobTitle, double salary) {
        name = name;// ths will call the string name 1st bcz local variable
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;


        // new Tester("james).name
        ////new Tester("mj").name

    }
    public void smokeTesting(){
        System.out.println(this.name + " is running a smoke tes");
    }
public void createTicket(){

}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setSalary(double salary) {
        this.salary = salary;





    }
}


