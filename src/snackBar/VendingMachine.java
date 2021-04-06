package src.snackBar;

public class VendingMachine {
    private static int maxId = 1;
    private int id;
    private String name;

    public VendingMachine( String name) {
        id = maxId;
        maxId++;
        this.name = name;
    }

    // Methods

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "VendingMachine {\n" + "id: " + id + "\n" + "name: " + name + "\n}";
    }
}
