package src.snackBar;

public class Customer {
    private static int maxId = 1;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand)
    {
        id = maxId;
        maxId++;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // Methods

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void addCash(double cash) {
        cashOnHand = cashOnHand + cash;
    }

    public void buySnacks(double cash) {
        cashOnHand = cashOnHand - cash;
    }

}


