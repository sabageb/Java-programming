package Practice_06_01_2021;

/*
-create a class called ScramTeam
Attributes:
            PO, BA, SM

            ArrayList<Tester>testerList = new ArrayList<>();
            ArrayList<Developer>developsList = new ArrayList<>();
            hasSprint, hasMeeting

            Constructor:
            sets the names of : PO, BA SM

 Actions:addTester(Tester tester): adds the given tester to the testers arraylist
 addTesters(Tester[] testers): adds the given testers to the testers arraylist
 addDeveloper(Developer developer): adds the given developer to the developers arraylist
 addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
 removeTester(long employeeId): removes the given tester from the testers arraylist
 removeDevelopers(long employeeId): removes the developer from the developers arraylist
 toString(): prints number of tester, & developers, PO name, SM name, BA name
 */


import java.util.ArrayList;
import java.util.Arrays;

public class ScramTeam {


    String ProductOwner;
    String scramMaster;
    String businessAnalysts;

    ArrayList<Tester> allTesters = new ArrayList<>();// tester belongs toscammaster
    ArrayList<Developer> allDevelopers = new ArrayList<>();


    int sprintNumber;
    public void ScrumTeam(String productOwner, String scramMaster, String businessAnalysts){
        this.ProductOwner = productOwner;
        this.scramMaster = scramMaster;
        this.businessAnalysts = businessAnalysts;
        this.allTesters = new ArrayList<>();
        this.allDevelopers = new ArrayList<>();

    }
public void addTester(Tester tester){
        this.allTesters.add(tester);

}
// Overloading
public void addTester(String[] tester ){

}
public void addTester(Tester... testers){// Tester [] testers
        this.allTesters.addAll(Arrays.asList(testers));
}

    public static void main(String[] args) {
       /*
        ScramTeam scramTeam = new ScramTeam(productOwner:"ziba",scrumMaster:"John", businessAnalyst: "Fikret");
        */
       // System.out.println(scramTeam.allTesters);
     //   Tester tester1 = new Tester(name: "Maxim", employeeID:11, jobTitle:"SDET", Salary:1000000);
    //    scramTeam.addTester(tester1);
   //scramTeam.addTester = (new Tester(name:"Anna", employeeID:11, jobTitle"SDET", salary: 100000);
  //      System.out.println(scramTeam.allTesters);
//scramTeam.addDeveloper(new Developer(name: "Anthonie", enployee:1, jonTitle:"dev", salary:1000000));
        //System.out.println(scramTeam.allDevelopers);
    }
}
