package ua.com.patterns.flyweight;

public class Soldier {
    private String dislocation;
    private String description;
    private Integer age;
    private String subDivisionTitle;

    public Soldier(String dislocation, String description, Integer age, String subDivisionTitle) {
        this.dislocation = dislocation;
        this.description = description;
        this.age = age;
        this.subDivisionTitle = subDivisionTitle;
    }

    public String getDislocation() {
        return dislocation;
    }

    public String getDescription() {
        return description;
    }

    public Integer getAge() {
        return age;
    }

    public String getSubDivisionTitle() {
        return subDivisionTitle;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "dislocation='" + dislocation + '\'' +
                ", description='" + description + '\'' +
                ", age=" + age +
                ", subDivisionTitle='" + subDivisionTitle + '\'' +
                '}';
    }
}
