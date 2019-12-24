package ua.com.patterns.iterator;

public class IntegerIterableCollection implements IterableCollection<Integer> {
    private final Integer[] integers;

    IntegerIterableCollection(Integer[] integers) {
        this.integers = integers;
    }

    @Override
    public StepIterator<Integer> createIterator() {
        return new IntegerStepIterator(integers);
    }
}
