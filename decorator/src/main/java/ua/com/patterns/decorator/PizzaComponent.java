package ua.com.patterns.decorator;

public abstract class PizzaComponent implements Cost {
    private final Cost pizzaComponent;
    private final int price;

    public PizzaComponent(Cost pizzaComponent, int price) {
        this.pizzaComponent = pizzaComponent;
        this.price = price;
    }

    @Override
    public int cost() {
        return price;
    }

    public Cost getPizzaComponent() {
        return pizzaComponent;
    }
}
