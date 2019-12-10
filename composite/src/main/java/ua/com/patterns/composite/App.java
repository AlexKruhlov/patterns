package ua.com.patterns.composite;

import ua.com.patterns.composite.components.Box;
import ua.com.patterns.composite.components.Composite;
import ua.com.patterns.composite.items.Cola;
import ua.com.patterns.composite.items.FrenchFry;
import ua.com.patterns.composite.items.Hamburger;
import ua.com.patterns.composite.items.IceCream;

public class App {

    public static void main(String[] args) {
        Composite order = new Box();

        Composite bigHamburgMenu = new Box();
        ((Box) bigHamburgMenu).add(new Hamburger());
        ((Box) bigHamburgMenu).add(new Cola());
        ((Box) bigHamburgMenu).add(new FrenchFry());

        ((Box) order).add(bigHamburgMenu);
        ((Box) order).add(new Cola());
        ((Box) order).add(new IceCream());

        System.out.println("BigHamburger Menu");
        System.out.println("==================");
        System.out.println(bigHamburgMenu.getDescription());
        System.out.println("==================");
        System.out.println("Sum: " + bigHamburgMenu.getSum());
        System.out.println("\n");

        System.out.println("Order");
        System.out.println("==================");
        System.out.println(order.getDescription());
        System.out.println("==================");
        System.out.println("Sum: " + order.getSum());

    }
}
