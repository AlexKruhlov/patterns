package ua.com.patterns.abstractfactory;

public class ClassicTable implements Table {
    private static final String description = "Classic Styled Table";

    public String describeTable() {
        return description;
    }
}
