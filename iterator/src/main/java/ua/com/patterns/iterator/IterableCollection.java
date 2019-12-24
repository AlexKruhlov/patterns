package ua.com.patterns.iterator;

public interface IterableCollection<T> {

    StepIterator<T> createIterator();
}
