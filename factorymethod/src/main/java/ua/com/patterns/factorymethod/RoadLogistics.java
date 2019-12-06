package ua.com.patterns.factorymethod;

public class RoadLogistics extends Logistics {

    public Transportable createTransport() {
        return new Truck();
    }
}
