package Practice_06_01_2021;

public class Developer {
    private String name;// instance variable
    private int employeeId;
    public String jobTitle;
    private double salary;
    private static boolean hasCodingSkills=true;

//constructor
    public Developer(String name, int employeeId, String jobTitle, double salary){
        this.name = name;
        this.employeeId= employeeId;
        this.jobTitle = jobTitle;
        this.salary =salary;



    }
//Action
    public void coding(){
        System.out.println(this.name + "is  coding");

    }
    public void fixingBug(){
        System.out.println(this.name + " is fixing a bug");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static boolean isHasCodingSkills() {
        return hasCodingSkills;
    }

    public static void setHasCodingSkills(boolean hasCodingSkills) {
        Developer.hasCodingSkills = hasCodingSkills;
    }
}
