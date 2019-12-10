package ua.com.patterns.composite.items;

import ua.com.patterns.composite.components.Composite;

public class Cola implements Composite {
    private final String description = "NucaCola";
    private final int cost = 120;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getSum() {
        return cost;
    }
}
