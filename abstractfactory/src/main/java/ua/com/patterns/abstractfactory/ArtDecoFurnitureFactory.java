package ua.com.patterns.abstractfactory;

public class ArtDecoFurnitureFactory implements FurnitureFactory {

    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    public Chair createChair() {
        return new ArtDecoChair();
    }

    public Table createTable() {
        return new ArtDecoTable();
    }
}
