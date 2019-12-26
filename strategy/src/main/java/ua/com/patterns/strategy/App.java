package ua.com.patterns.strategy;

public class App {

    public static void main(String[] args) {
        String[] arr1 = new String[]{"Ann", "Bonni", "Gina", "Misha", "Regina"};
        Searcher searcher = new Searcher(new BinarySearchStrategy());
        System.out.println(searcher.search("Misha", arr1));
        searcher.setStringSearchStrategy(new LineSearchStrategy());
        String[] arr2 = new String[]{"Ann", "Bonni", "Gina", "Misha", "Regina"};
        System.out.println(searcher.search("Regina", arr2));
    }
}
