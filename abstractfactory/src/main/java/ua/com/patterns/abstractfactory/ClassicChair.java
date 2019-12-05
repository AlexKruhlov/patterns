package ua.com.patterns.abstractfactory;

public class ClassicChair implements Chair {
    private static final String description = "Classic Styled Chair";

    public String describeChair() {
        return description;
    }
}
