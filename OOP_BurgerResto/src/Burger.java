public class Burger {

    private int quantity;
    private int toppings;
    private String burgerType;
    private int burgerPrice;

    public Burger() {
    }

    public void selectBurgerType(String burgerType) {
        this.burgerType = burgerType;

        if (burgerType.equalsIgnoreCase("regular")) {
            this.burgerPrice = 100;
        } else if (burgerType.equalsIgnoreCase("deluxe")) {
            this.burgerPrice = 150;
        } else {
            System.out.println("Unknown burger type");
            this.burgerPrice = 0;
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

    public void selectToppings(int toppings) {
        if (toppings > 3) {
            System.out.println("You can only select up to 3 toppings.");
            this.toppings = 3;
        } else if (toppings < 0) {
            System.out.println("Invalid toppings, defaulting to 0");
            this.toppings = 0;
        } else {
            this.toppings = toppings;
        }
    }

    public int calculatePrice() {
        int toppingsCostPerBurger = toppings * 1;
        int pricePerBurger = burgerPrice + toppingsCostPerBurger;
        return quantity * pricePerBurger;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "quantity=" + quantity +
                ", toppings=" + toppings +
                ", burgerType='" + burgerType + '\'' +
                ", burgerPrice=" + burgerPrice +
                '}';
    }
}