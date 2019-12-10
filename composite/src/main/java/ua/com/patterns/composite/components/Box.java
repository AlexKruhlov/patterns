package ua.com.patterns.composite.components;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Box implements Composite {
    private final List<Composite> composites = new ArrayList<>();

    @Override
    public String getDescription() {
        return composites.stream()
                .map(Composite::getDescription)
                .collect(joining("\n"));
    }

    @Override
    public int getSum() {
        return composites.stream()
                .mapToInt(Composite::getSum)
                .sum();
    }

    public void add(Composite composite) {
        composites.add(composite);
    }
}
