package ua.com.patterns.abstractfactory;

public class App {

    public static void main(String[] args) {
        FurnitureShop furnitureShop = new FurnitureShop(new ClassicFurnitureFactory(), new ArtDecoFurnitureFactory());
        furnitureShop.prepareArtDecoFurnitureSet();
        furnitureShop.prepareClassicFurnitureSet();
    }
}
