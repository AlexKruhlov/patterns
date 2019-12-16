package ua.com.patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class App {
    // Try to check Memory changing
    public static void main(String[] args) {
        List<Soldier> soldiers = new ArrayList<>();
        soldiers.add(SoldierFactory.generateSoldier("Chad1, Africa", "Some man1", 21, "Artillery #21"));
        soldiers.add(SoldierFactory.generateSoldier("Chad2, Africa", "Some man2, colored white hair", 36, "Artillery #21"));
        soldiers.add(SoldierFactory.generateSoldier("Chad3, Africa", "Some man3, black hair", 57, "Artillery #21"));
        soldiers.add(SoldierFactory.generateSoldier("Chad4, Africa", "Some man4, black hair", 21, "Artillery #21"));
    }
}
