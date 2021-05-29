package day48_constractors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1= new Customer();
        System.out.println(cs1.toString());//print wih default values that are set in no -args constructor
       // System.out.println(cs1);
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", 2);// creat object and sign values in same statement
        Customer cs3= new Customer("John Ward III", 4837);
        System.out.println(cs2);
        System.out.println(cs3);

        // array of Customers : index 0    1   2
        Customer[] todaysCustomers = {cs1,cs2, cs3, new Customer("Bashier", 449)};

        // arrayList of Customer objects- most common
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Bashir",449));
        customerList.add(new Customer("Suleman", 9763));

        //Print info of first customer object in array and arrayList
        System.out.println(todaysCustomers[0].toString());
        System.out.println(customerList.get(0).toString());
        System.out.println(customerList);// print toString() info of all customer objects

        System.out.println("-------------------FOR LOOP-----------------------");
        for (int i =0; i<customerList.size(); i++){
            System.out.println(customerList.get(i));
        }

        System.out.println("-------------FOR EACH LOOP----------------------");
        for (Customer eachCustomer : customerList) {

            System.out.println(eachCustomer);
        }
// print only names of customers in the list
        System.out.println("---------------------NAMES OF CUSTOMERS-------------");
// foreach method and lambda expression
        customerList.forEach(each -> System.out.println(each.getName()));

        for (Customer eachCustomer : customerList){
            System.out.println(eachCustomer.getName());

        }
    }
}
