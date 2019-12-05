package ua.com.patterns.abstractfactory;

public class ArtDecoChair implements Chair {
    private static final String description = "Art Deco Styled Chair";

    public String describeChair() {
        return description;
    }
}
