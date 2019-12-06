package ua.com.patterns.factorymethod;

public class App {

    public static void main(String[] args) {
        new RoadLogistics().planDelivery();
        new SeaLogistics().planDelivery();
    }
}
