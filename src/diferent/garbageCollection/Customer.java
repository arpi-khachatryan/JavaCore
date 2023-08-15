package diferent.garbageCollection;

public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public Customer(Customer oldCustomer) {
        this.name = oldCustomer.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void finalize() {
        System.out.println("This object is being gc'd.");
    }
}
