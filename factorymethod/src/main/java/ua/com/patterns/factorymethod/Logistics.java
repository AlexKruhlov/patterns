package ua.com.patterns.factorymethod;

public abstract class Logistics {

    public void planDelivery() {
        Transportable transport = createTransport();
        System.out.println("We plan to ");
        transport.deliver();
    }

    public abstract Transportable createTransport();
}
