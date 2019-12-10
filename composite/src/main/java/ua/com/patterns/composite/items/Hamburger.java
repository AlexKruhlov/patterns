package ua.com.patterns.composite.items;

import ua.com.patterns.composite.components.Composite;

public class Hamburger implements Composite {
    private final String description = "Hamburger";
    private final int cost = 250;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getSum() {
        return cost;
    }
}
