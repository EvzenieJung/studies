package com.studies.studies.designPatterns.behavioral.state;

public class PlayingState extends State {
    public PlayingState(Game game) {
        super(game);
        System.out.println("-- Game in playing screen state. --");
    }

    @Override
    public void onWelcomeScreen() {
        System.out.println("Not allowed!");
    }

    @Override
    public void onPlaying() {
        System.out.println("Playing...");
    }

    @Override
    public void onBreak() {
        game.changeState(new BreakSate(game));
    }

    @Override
    public void onEndGame() {
        game.changeState(new EndGameState(game));
    }
}
