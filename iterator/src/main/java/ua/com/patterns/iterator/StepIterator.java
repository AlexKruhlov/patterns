package ua.com.patterns.iterator;

public interface StepIterator<T> {

    T next();

    boolean hasNext();

    T first();

    T last();
}
