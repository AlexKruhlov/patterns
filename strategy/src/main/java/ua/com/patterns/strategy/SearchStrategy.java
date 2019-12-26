package ua.com.patterns.strategy;

public interface SearchStrategy<T> {

    T search(T element, T[] list);
}
