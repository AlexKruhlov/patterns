package ua.com.patterns.abstractfactory;

public class FurnitureShop {
    private final FurnitureFactory classicFurnitureFactory;
    private final FurnitureFactory artDecoFurnitureFactory;

    public FurnitureShop(FurnitureFactory classicFurnitureFactory, FurnitureFactory artDecoFurnitureFactory) {
        this.classicFurnitureFactory = classicFurnitureFactory;
        this.artDecoFurnitureFactory = artDecoFurnitureFactory;
    }

    public void prepareClassicFurnitureSet() {
        System.out.println("Classic furniture preparing...");
        System.out.println(classicFurnitureFactory.createChair().describeChair());
        System.out.println(classicFurnitureFactory.createSofa().describeSofa());
        System.out.println(classicFurnitureFactory.createTable().describeTable());
        System.out.println("=============================================");
    }

    public void prepareArtDecoFurnitureSet() {
        System.out.println("Art Deco furniture preparing...");
        System.out.println(artDecoFurnitureFactory.createChair().describeChair());
        System.out.println(artDecoFurnitureFactory.createSofa().describeSofa());
        System.out.println(artDecoFurnitureFactory.createTable().describeTable());
        System.out.println("=============================================");
    }
}
