package com.studies.studies.designPatterns.behavioral.state;

public class BreakSate extends State {

    public BreakSate(Game game) {
        super(game);
        System.out.println("-- Game in break screen state. --");
    }

    @Override
    public void onWelcomeScreen() {
        System.out.println("Not allowed!");
    }

    @Override
    public void onPlaying() {
        game.changeState(new PlayingState(game));
    }

    @Override
    public void onBreak() {
        System.out.println("Already in break screen.");
    }

    @Override
    public void onEndGame() {
        System.out.println("Not allowed!");
    }
}
