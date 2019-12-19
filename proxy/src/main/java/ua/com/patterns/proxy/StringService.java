package ua.com.patterns.proxy;

public class StringService implements Service {

    public void printTwice(String string) {
        System.out.println(string + " " + string);
    }
}
