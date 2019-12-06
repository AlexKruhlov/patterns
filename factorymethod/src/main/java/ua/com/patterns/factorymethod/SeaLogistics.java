package ua.com.patterns.factorymethod;

public class SeaLogistics extends Logistics {

    public Transportable createTransport() {
        return new Ship();
    }
}
