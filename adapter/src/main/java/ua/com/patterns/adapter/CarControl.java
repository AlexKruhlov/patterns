package ua.com.patterns.adapter;

public class CarControl implements Control {
    private final Car car;

    public CarControl(Car car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.ride();
    }

    @Override
    public void sendMessage() {
        car.soundMessage();
    }

    @Override
    public void stop() {
        car.stopCar();
    }
}
