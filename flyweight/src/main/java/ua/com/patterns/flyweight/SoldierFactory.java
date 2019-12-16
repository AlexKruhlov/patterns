package ua.com.patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class SoldierFactory {
    private static final List<Integer> existedAges = new ArrayList<>();
    private static final List<String> existedSubDivisionTitles = new ArrayList<>();

    public static Soldier generateSoldier(String dislocation, String description, Integer age, String subDivisionTitle) {
        return new Soldier(dislocation, description, getAge(age), getExistedSubdivisionTitle(subDivisionTitle));
    }

    private static Integer getAge(Integer age) {
        int indexOfCurrentAge = existedAges.indexOf(age);
        if (indexOfCurrentAge == -1) {
            existedAges.add(age);
            indexOfCurrentAge = existedAges.indexOf(age);
        }
        return existedAges.get(indexOfCurrentAge);
    }

    private static String getExistedSubdivisionTitle(String subDivisionTitle) {
        int indexOfSubdivisionTitle = existedSubDivisionTitles.indexOf(subDivisionTitle);
        if (indexOfSubdivisionTitle == -1) {
            existedSubDivisionTitles.add(subDivisionTitle);
            indexOfSubdivisionTitle = existedSubDivisionTitles.indexOf(subDivisionTitle);
        }
        return existedSubDivisionTitles.get(indexOfSubdivisionTitle);
    }
}
