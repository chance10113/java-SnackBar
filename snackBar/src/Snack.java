package snackBar.src;

public class Snack {
    private static int maxId = 1;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack (
        String name,
        int quantity,
        double cost,
        int vendingMachineId
    ) {
        id = maxId;
        maxId++;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getVendingMachineId() {
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int inv) {
        quantity = quantity + inv;
    }

    public void buyQuantity(int inv) {
        quantity = quantity - inv;
    }

    public double buySnack(int inv) {
        return inv * cost;
    }

@Override
public String toString() {
    return "Snack { \n" + "id: " + id + "\n" + "name: " + name + "\n" + "cost: " + cost + "\n" + "quantity: " + quantity + "\n" + "vending machine id: " + vendingMachineId + "\n}";
}
}
