package com.studies.studies.designPatterns.behavioral.state;

public class EndGameState extends State {

    public EndGameState(Game game) {
        super(game);
        System.out.println("-- Game in end screen state. --");
    }

    @Override
    public void onWelcomeScreen() {
        game.changeState(new WelcomeState(game));
    }

    @Override
    public void onPlaying() {
        System.out.println("Not allowed!");
    }

    @Override
    public void onBreak() {
        System.out.println("Not allowed!");
    }

    public void onEndGame() {
        System.out.println("Currently on end game state.");
    }
}
