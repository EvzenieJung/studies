package com.studies.studies.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Utils {
    public static void main(String[] args) throws IOException {
        Path currentFile = Paths.get("/Users/evzeniejung/IdeaProjects/files/temp.txt");
        Path outputFile = Paths.get("/Users/evzeniejung/IdeaProjects/files/new.txt");
        Path directory = Paths.get("/IdeaProjects/");
        Files.copy(currentFile, outputFile);
        Files.copy(outputFile, directory);
        Files.delete(outputFile);
    }
}
