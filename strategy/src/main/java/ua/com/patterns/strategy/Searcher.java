package ua.com.patterns.strategy;

import static java.lang.Math.abs;

public class Searcher {
    private SearchStrategy<String> stringSearchStrategy;

    public Searcher(SearchStrategy<String> stringSearchStrategy) {
        this.stringSearchStrategy = stringSearchStrategy;
    }

    public String search(String elem, String[] arr) {
        if (stringSearchStrategy instanceof BinarySearchStrategy && !isOrdered(arr)) {
            throw new RuntimeException("Array isn't ordered. Please, choose other strategy!");
        }
        return stringSearchStrategy.search(elem, arr);
    }

    public void setStringSearchStrategy(SearchStrategy<String> stringSearchStrategy) {
        this.stringSearchStrategy = stringSearchStrategy;
    }

    private boolean isOrdered(String[] arr) {
        String currentStr = arr[0];
        int comparingIndex = 0;
        for (String str : arr) {
            int currentComparingIndex = (currentStr.compareTo(str) > 0 ? comparingIndex + 1 : comparingIndex - 1);
            if (abs(currentComparingIndex) < abs(comparingIndex)) {
                return false;
            }
            comparingIndex = currentComparingIndex;
            currentStr = str;
        }
        return true;
    }
}
