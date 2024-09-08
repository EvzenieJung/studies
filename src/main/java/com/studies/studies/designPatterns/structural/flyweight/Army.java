package com.studies.studies.designPatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private final List<Fighter> army = new ArrayList<>();

    public void spawnFighters(FighterRank rank) {
        Fighter f = FighterFactory.getFighter(rank);
        army.add(f);
    }

    public void drawArmy() {
        for (Fighter f : army) {
            switch (f.getRank()) {
                case PRIVATE : System.out.print("P ");
                    break;
                case SERGE : System.out.print("S ");
                    break;
                default: System.out.print("M ");
                    break;
            }
        }
    }
}
