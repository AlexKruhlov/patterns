package ua.com.patterns.facade;

import static java.lang.Thread.sleep;

public class BoeingPlane implements PlaneFacade {
    private final Engine engine;
    private final AutoPilot autoPilot;
    private final CommunicationSystem communicationSystem;

    public BoeingPlane(Engine engine, AutoPilot autoPilot, CommunicationSystem communicationSystem) {
        this.engine = engine;
        this.autoPilot = autoPilot;
        this.communicationSystem = communicationSystem;
    }

    @Override
    public void takeOff() {
        System.out.println("Plane is taking off...");
        System.out.println("===========================================");
        messageTo("I request permission to take off...");
        delay(5);
        messageFrom("Permission is given...");
        delay(2);
        regulateEngine(1);
        delay(2);
        regulateEngine(5);
        delay(2);
        autoPilotOn();
        delay(2);
        messageFrom("Take-off was successful");
        delay(2);
        regulateEngine(9);
        System.out.println("===========================================\n");
    }

    @Override
    public void landing() {
        System.out.println("Plane is landing");
        System.out.println("===========================================");
        messageTo("Request permission for landing...");
        delay(5);
        messageFrom("Permission is given...");
        delay(2);
        regulateEngine(-5);
        delay(2);
        autoPilotOff();
        delay(2);
        regulateEngine(-3);
        messageTo("Landing was successful...");
        regulateEngine(0);
        System.out.println("===========================================");
    }

    @Override
    public void autoPilotOn() {
        autoPilot.switchOn();
    }

    @Override
    public void autoPilotOff() {
        autoPilot.switchOff();
    }

    @Override
    public void regulateEngine(int point) {
        if (point == 1) {
            engine.switchOn();
            delay(2);
            engine.increaseBy(1);
        } else if (point == 0) {
            engine.switchedOff();
        } else if (point >= 1) {
            engine.increaseBy(point);
        } else {
            engine.decreaseBy(point);
        }
        delay(2);
    }

    @Override
    public void messageTo(String message) {
        communicationSystem.sendMessage(message);
    }

    @Override
    public void messageFrom(String message) {
        communicationSystem.readMessage(message);
    }

    @Override
    public void alert() {
        messageTo("S.O.S.!!!!!");
        delay(2);
        messageTo("S.O.S.!!!!!");
        delay(2);
        messageTo("S.O.S.!!!!!");
        delay(2);
        autoPilotOff();
        System.out.println("\n");
    }

    private void delay(int sec) {
        try {
            sleep(sec * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
