package ua.com.patterns.adapter;

public class ShipControl implements Control {
    private final Ship ship;

    public ShipControl(Ship ship) {
        this.ship = ship;
    }

    @Override
    public void move() {
        ship.fullAhead();
    }

    @Override
    public void sendMessage() {
        ship.lightMessage();
    }

    @Override
    public void stop() {
        ship.stopEngine();
    }
}
