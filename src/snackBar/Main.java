package src.snackBar;

public class Main {
    public static void main(String[] args) {
        workWithData();
    }

    private static void workWithData() {
        String myString = "Hello World";
        System.out.println(myString);

        Customer Jane = new Customer("Jane", 45.25);
        Customer Bob = new Customer("Bob", 33.14);

        VendingMachine Food = new VendingMachine("Food");
        VendingMachine Drink = new VendingMachine("Drink");
        VendingMachine Office = new VendingMachine("Office");

        Snack Chips = new Snack("Chips", 36, 1.75, Food.getId());
        Snack ChocolateBar = new Snack("Chocolate Bar", 36, 1.00, Food.getId());
        Snack Pretzel = new Snack("Pretzel", 36, 2.00, Food.getId());

        Snack Soda = new Snack("Soda", 24, 2.50, Drink.getId());
        Snack Water = new Snack("Water", 20, 2.75, Drink.getId());

        System.out.println("Customer Jane buys 3 Sodas");
        Soda.buyQuantity(3);
        Jane.buySnack(Soda.buySnack(3));
        System.out.println("Jane's cash on hand is " + Jane.getCashOnHand());
        System.out.println("Quantity of soda is " + Soda.getQuantity() + "\n");

        System.out.println("Jane buys 1 Pretzel");
        Pretzel.buyQuantity(1);
        Jane.buySnack(Pretzel.buySnack(1));
        System.out.println("Jane's cash on hand is " + Jane.getCashOnHand());
        System.out.println("Quantity of pretzel is " + Pretzel.getQuantity() + "\n");
    }
}
