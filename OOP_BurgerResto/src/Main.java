public class Main {
    public static void main(String[] args) {

//        Burger burger = new Burger();
//        burger.selectBurgerType("deluxe");
//        burger.selectQuantity(2);
//        burger.selectToppings(3);
//
//        Drink drink = new Drink();
//        drink.selectDrink("Coke");
//        drink.selectSize("large");
//        drink.selectQuantity(2);
//
//        Meal meal = new Meal();
//        meal.selectMealType("regular");
//        meal.selectQuantity(1);
//        meal.selectToppings(2);
//
//        System.out.println(burger);
//        System.out.println(drink);
//        System.out.println(meal);

        Order tim = new Order("Tim");

        Burger burger = new Burger();
        burger.selectBurgerType("regular");
        burger.selectQuantity(1);
        burger.selectToppings(3);

        tim.addBurger(burger);

        Drink drink = new Drink();
        drink.selectDrink("Coke");
        drink.selectSize("medium");
        drink.selectQuantity(1);

        tim.addDrink(drink);

        tim.printOrder();
            }
        }
