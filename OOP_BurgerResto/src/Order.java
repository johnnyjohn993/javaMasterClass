public class Order {

    private String customerName;

    private Burger burger;
    private Drink drink;
    private Meal meal;

    public Order(String customerName) {
        this.customerName = customerName;
    }

    public void addBurger(Burger burger) {
        this.burger = burger;
    }

    public void addDrink(Drink drink) {
        this.drink = drink;
    }

    public void addMeal(Meal meal) {
        this.meal = meal;
    }

    public int calculateTotal() {
        int total = 0;

        if (burger != null) {
            total += burger.calculatePrice();
        }

        if (drink != null) {
            total += drink.calculatePrice();
        }

        if (meal != null) {
            total += meal.calculatePrice();
        }

        return total;
    }

    public void printOrder() {
        System.out.println("Customer: " + customerName);

        if (burger != null) {
            System.out.println(burger);
        }

        if (drink != null) {
            System.out.println(drink);
        }

        if (meal != null) {
            System.out.println(meal);
        }

        System.out.println("TOTAL: " + calculateTotal());
        System.out.println("----------------------");
    }
}