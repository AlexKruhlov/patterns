package ua.com.patterns.composite.items;

import ua.com.patterns.composite.components.Composite;

public class FrenchFry implements Composite {
    private final String description = "FrenchFry";
    private final int cost = 200;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getSum() {
        return cost;
    }
}
