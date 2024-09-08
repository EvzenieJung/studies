package com.studies.studies.designPatterns.behavioral.state;

public class WelcomeState extends State {

    public WelcomeState(Game game) {
        super(game);
        System.out.println("-- Game in welcome screen state. --");
    }

    @Override
    public void onWelcomeScreen() {
        System.out.println("Currently on welcome screen.");
    }

    @Override
    public void onPlaying() {
        game.changeState(new PlayingState(game));
    }

    @Override
    public void onBreak() {
        System.out.println("Not allowed!");
    }

    @Override
    public void onEndGame() {
        System.out.println("Not allowed!");
    }
}
