package ua.com.patterns.abstractfactory;

public class ClassicFurnitureFactory implements FurnitureFactory {

    public Sofa createSofa() {
        return new ClassicSofa();
    }

    public Chair createChair() {
        return new ClassicChair();
    }

    public Table createTable() {
        return new ClassicTable();
    }
}
