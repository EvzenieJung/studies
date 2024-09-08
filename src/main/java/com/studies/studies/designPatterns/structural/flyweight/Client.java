package com.studies.studies.designPatterns.structural.flyweight;

import java.util.Random;

public class Client {

    public static void main(String[] args) {
        int toDraw = 100;
        Army army = new Army();
        FighterRank currentRank;
        Random random = new Random();

        for (int i = 0; i < toDraw; i++) {
            currentRank = switch (random.nextInt(3)) {
                case 0 -> FighterRank.PRIVATE;
                case 1 -> FighterRank.SERGE;
                default -> FighterRank.MAJOR;
            };
            army.spawnFighters(currentRank);
        }
        army.drawArmy();
    }
}
