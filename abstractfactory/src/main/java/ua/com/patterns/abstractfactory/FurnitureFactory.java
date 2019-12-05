package ua.com.patterns.abstractfactory;

public interface FurnitureFactory {

    Sofa createSofa();

    Chair createChair();

    Table createTable();
}
