package ua.com.patterns.strategy;

public class LineSearchStrategy implements SearchStrategy<String> {

    @Override
    public String search(String element, String[] arr) {
        for (String s : arr) {
            if (s.equals(element)) {
                return s;
            }
        }
        return null;
    }
}
