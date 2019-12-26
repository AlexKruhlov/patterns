package ua.com.patterns.strategy;

public class BinarySearchStrategy implements SearchStrategy<String> {

    @Override
    public String search(String element, String[] arr) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = element.compareTo(arr[m]);
            // Check if x is present at mid
            if (res == 0) {
                return arr[m];
            }
            // If x greater, ignore left half
            if (res > 0)
                l = m + 1;
                // If x is smaller, ignore right half
            else
                r = m - 1;
        }
        return null;
    }
}
