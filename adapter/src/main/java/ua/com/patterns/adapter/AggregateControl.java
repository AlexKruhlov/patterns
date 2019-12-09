package ua.com.patterns.adapter;

public class AggregateControl implements Control {
    private final Control control;

    public AggregateControl(Control control) {
        this.control = control;
    }

    public void move() {
        control.move();
    }

    public void sendMessage() {
        control.sendMessage();
    }

    public void stop() {
        control.stop();
    }
}
