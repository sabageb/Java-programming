package day48_constractors_static;

public class Customer {

    private String name;
    private  int id;


    //No-Args constructor
    public Customer() {
        System.out.println("No-Args constructor");
        name = "New customer";
        id = -1;
    }

    // add a constractor with param where we can assign name and id

    public Customer(String name, int id){
        System.out.println("2-args constructor");
        this.name=name;// setName(name);
        this.id=id;//setId(id);when we have some
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
