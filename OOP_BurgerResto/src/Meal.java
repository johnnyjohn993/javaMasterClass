public class Meal {

    private String mealType;
    private int quantity;
    private int toppings;
    private int basePrice;

    public Meal() {}

    public void selectMealType(String mealType) {
        this.mealType = mealType;

        if (mealType.equalsIgnoreCase("regular")) {
            this.basePrice = 180;
        } else if (mealType.equalsIgnoreCase("deluxe")) {
            this.basePrice = 250;
        } else {
            System.out.println("Unknown meal type");
            this.basePrice = 0;
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
            System.out.println("Max 3 toppings only");
            this.toppings = 3;
        } else if (toppings < 0) {
            this.toppings = 0;
        } else {
            this.toppings = toppings;
        }
    }

    public int calculatePrice() {
        int toppingsCost = toppings * 1;
        int totalPerMeal = basePrice + toppingsCost;
        return quantity * totalPerMeal;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mealType='" + mealType + '\'' +
                ", quantity=" + quantity +
                ", toppings=" + toppings +
                ", totalPrice=" + calculatePrice() +
                '}';
    }
}