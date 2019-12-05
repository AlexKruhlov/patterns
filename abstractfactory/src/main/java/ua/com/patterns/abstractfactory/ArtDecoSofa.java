package ua.com.patterns.abstractfactory;

public class ArtDecoSofa implements Sofa {
    private static final String description = "Art Deco Styled Sofa";

    public String describeSofa() {
        return description;
    }
}
