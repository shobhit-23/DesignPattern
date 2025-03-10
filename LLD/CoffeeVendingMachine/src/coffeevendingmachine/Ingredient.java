package coffeevendingmachine;

public class Ingredient {
    private final String name;
    private int quantity;

    public Ingredient(String name,int quantity) {
        this.name = name;
        this.quantity=quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public synchronized void updateQuantity(int amount)
    {
        quantity+=amount;
    }

}
