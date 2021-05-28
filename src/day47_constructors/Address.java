package day47_constructors;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;
    private String country = "USA";

    // constructor method - automatically called
    public Address() {
        System.out.println("Address constructor");
        street = "123 unknown st";
        city = "Unknown";
        state = "Unknown";
        zipcode = "00000";

    }


    //second constructor, overloaded contractor -> provides shortcut to initialize variable
// in same statement: ex: Address ad = new Address ("123 java st", "Boston", "MA", "43213");
    public Address(String street, String city, String state, String zipcode) {
      // this.street = street;// this is same as setStreet(street)
        setStreet(street);// reuse the code in the setter method
        this.city = city;// this.city and setStreet is same
        this.state = state;//
        this.zipcode = zipcode;
    }

    public String toString() {
        return street + ", " + city + ", " + state + " " + zipcode;
    }
      //public String getStreet() {
        //  return street;

      //}

//public String getStreet(){
   // return street;
//}
    public void setStreet(String street) {
        this.street = street;
        if (street.isEmpty() || street.length() > 50) {
            System.out.println("ERROR: Invalid street");
            //System.exit(0);
        } else {
            this.street = street;
        }
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {
        this.city = city;

    }

    public String getState() {
        return state;

    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;

    }

    public void setZipcode(String zipcode) {

    }

    public String getStreet() {
        return street;





    }

}

