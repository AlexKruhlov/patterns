package ua.com.patterns.abstractfactory;

public class ArtDecoTable implements Table {
    private static final String description = "Art Deco Styled Table";

    public String describeTable() {
        return description;
    }
}
