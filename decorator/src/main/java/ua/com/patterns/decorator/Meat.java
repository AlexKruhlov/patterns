package ua.com.patterns.decorator;

import static java.lang.Math.round;

public class Meat extends PizzaComponent {

    public Meat(Cost pizzaComponent, int price) {
        super(pizzaComponent, price);
    }

    @Override
    public int cost() {
        return super.getPizzaComponent().cost() + round(super.cost() * 1.2f);
    }
}
