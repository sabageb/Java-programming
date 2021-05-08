

package day43_list_custom_classes;
// firstName, age
public class Person {// we create these to be used by objects
    //Data -> variable
    String firstName;
    int age;
    char gender;
    // behavior - -> method
    public void speak() {
        System.out.println("Person is speaking");
    }
}

 class People {// class for running// you can add multiple classes but only 1 can be public
    public static void main(String[] args) {
      // create object from  person class - or we can say Instantiate person class

    Person person1 = new Person();
    person1.firstName = "Bob";
    person1.age = 33;
    person1.gender= 'M';
    person1.speak();

        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);
        System.out.println("person1.firstName = " + person1.firstName);



        Person person2 = new Person();//
        person2.firstName ="Mike";//data
        person2.age = 12;// data
        person2.gender = 'M';// data
        person2.speak();// behavior


        System.out.println(person2.firstName);
        System.out.println(person2.age);
        System.out.println(person2.gender);


        System.out.println("person2 = " + person2);

    }
}

