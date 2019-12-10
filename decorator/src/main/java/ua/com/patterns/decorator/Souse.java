package ua.com.patterns.decorator;

import static java.lang.Math.round;

public class Souse extends PizzaComponent {

    public Souse(Cost pizzaComponent, int price) {
        super(pizzaComponent, price);
    }

    @Override
    public int cost() {
        return super.getPizzaComponent().cost() + round(super.cost() * 1.5f);
    }
}
