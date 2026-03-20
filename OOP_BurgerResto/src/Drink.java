public class Drink {

    private String drinkSelection;
    private String size;
    private int quantity;
    private int price;

    public Drink() {}

    public void selectDrink(String drinkSelection) {
        this.drinkSelection = drinkSelection;
    }

    public void selectSize(String size) {
        this.size = size;

        if (size.equalsIgnoreCase("small")) {
            this.price = 50;
        } else if (size.equalsIgnoreCase("medium")) {
            this.price = 70;
        } else if (size.equalsIgnoreCase("large")) {
            this.price = 90;
        } else {
            System.out.println("Unknown size");
            this.price = 0;
        }
    }

    public void selectQuantity(int quantity) {
        if (quantity <= 0) {
            System.out.println("Invalid quantity, defaulting to 1");
            this.quantity = 1;
        } else {
            this.quantity = quantity;
        }
    }

    public int calculatePrice() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "drinkSelection='" + drinkSelection + '\'' +
                ", size='" + size + '\'' +
                ", quantity=" + quantity +
                ", totalPrice=" + calculatePrice() +
                '}';
    }
}