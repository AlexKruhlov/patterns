package ua.com.patterns.iterator;

import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {
        IntegerIterableCollection integerIterableCollection = new IntegerIterableCollection(new Integer[]{1, 2, 3, 4, 5, 7, 8, 9});
        StepIterator<Integer> iterator = integerIterableCollection.createIterator();
        IntStream.range(0, 10)
                .forEach(index -> {
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                });
        System.out.println("First element: " + iterator.first());
        System.out.println("Last element: " + iterator.last());
    }
}
