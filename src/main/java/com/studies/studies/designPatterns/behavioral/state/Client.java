package com.studies.studies.designPatterns.behavioral.state;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.state.onWelcomeScreen();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        do {
            System.out.println("-- Please input command (w, p, b, e):");
            try {
                input = reader.readLine();
                switch (input.toLowerCase()) {
                    case "w":
                        game.state.onWelcomeScreen();
                        break;
                    case "p":
                        game.state.onPlaying();
                        break;
                    case "b":
                        game.state.onBreak();
                        break;
                    case "e":
                        game.state.onEndGame();
                        break;
                    default:
                        System.out.println("Invalid command!");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } while (!input.equalsIgnoreCase("exit"));
    }
}
