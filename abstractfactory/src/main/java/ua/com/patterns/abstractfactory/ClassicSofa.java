package ua.com.patterns.abstractfactory;

public class ClassicSofa implements Sofa {
    private static final String description = "Classic Styled Sofa";

    public String describeSofa() {
        return description;
    }
}
