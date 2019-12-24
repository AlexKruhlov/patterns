package ua.com.patterns.iterator;

import static java.util.Objects.nonNull;

public class IntegerStepIterator implements StepIterator<Integer> {
    private Integer[] integers;
    private int currentIndex = -1;

    IntegerStepIterator(Integer[] integers) {
        this.integers = integers;
    }

    @Override
    public Integer next() {
        return integers[++currentIndex];
    }

    @Override
    public boolean hasNext() {
        if (nonNull(integers) && integers.length > 0) {
            return integers.length > currentIndex + 1;
        }
        return false;
    }

    @Override
    public Integer first() {
        currentIndex = 0;
        return integers[currentIndex];
    }

    @Override
    public Integer last() {
        currentIndex = integers.length - 1;
        return integers[currentIndex];
    }
}
