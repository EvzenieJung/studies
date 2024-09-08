package com.studies.studies.designPatterns.behavioral.strategy;

public class RandomCaseStrategy implements PrintStrategy {

    @Override
    public String formatString(String input) {
        StringBuilder formattedString = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Math.random() < 0.5) {
                formattedString.append(Character.toUpperCase(c));
            } else {
                formattedString.append(Character.toLowerCase(c));
            }
        }
        return formattedString.toString();
    }
}
