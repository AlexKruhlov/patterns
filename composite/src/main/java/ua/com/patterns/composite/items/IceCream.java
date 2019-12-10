package ua.com.patterns.composite.items;

import ua.com.patterns.composite.components.Composite;

public class IceCream implements Composite {
    private final String description = "IceCream";
    private final int cost = 180;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getSum() {
        return cost;
    }
}
