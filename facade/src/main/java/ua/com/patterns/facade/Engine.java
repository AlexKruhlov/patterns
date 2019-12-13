package ua.com.patterns.facade;

import static java.lang.Math.abs;

public class Engine {

    public void switchOn() {
        System.out.println("Engine is switched on");
    }

    public void switchedOff() {
        System.out.println("Engine is switched off");
    }

    public void increaseBy(int point) {
        System.out.println("Engine's power is increased by " + abs(point) + " points");
    }

    public void decreaseBy(int point) {
        System.out.println("Engine's power is decreased by " + abs(point) + " points");
    }
}
