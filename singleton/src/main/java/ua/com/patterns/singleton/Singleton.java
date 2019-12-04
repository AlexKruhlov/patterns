package ua.com.patterns.singleton;

import static java.util.Objects.isNull;

class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    static Singleton getInstance() {
        if (isNull(singleton)) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
