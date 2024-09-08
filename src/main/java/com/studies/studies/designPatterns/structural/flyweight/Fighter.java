package com.studies.studies.designPatterns.structural.flyweight;

public class Fighter implements Sprite {

    private FighterRank rank;

    public Fighter(FighterRank rank) {
        this.rank = rank;
    }

    public FighterRank getRank() {
        return rank;
    }

    @Override
    public void draw() {
        System.out.println("Drawing fighter: " + rank);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Moving fighter to (" + x + ", " + y + ")");
    }
}
