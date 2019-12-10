package ua.com.patterns.decorator;

public class App {

    public static void main(String[] args) {
        Cost pizza = new Souse(new Meat(new BasePizza(100),200), 300);
        System.out.println("Pizza cost: " + pizza.cost());
    }
}
