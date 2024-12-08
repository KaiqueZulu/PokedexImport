package com.matdev.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvUtils {
    private static final String RESOURCES = "src/main/resources/data/";

    public void readAndRewriteCSV() throws IOException {
        final Path path = Paths.get(RESOURCES+"Pokedex.csv");
        final List<String> lines = Files.readAllLines(path);
        List<String> updatedLines = new ArrayList<>();

        for (final String line: lines){
            final String[] columns = line.split(",");
            String[] removeBar = columns[1].split("/");
           if(removeBar.length >= 2 ){
              columns[1] = removeBar[0] + " " + removeBar[1];
           }

            String updatedLine = String.join(",", columns);
           updatedLines.add(updatedLine);
        }
        Files.write(path, updatedLines);
        System.out.println("File updated successfully!");
    }
    public List<String> readLines() throws IOException {
        final Path path = Paths.get(RESOURCES+"Pokedex.csv");
        return Files.readAllLines(path);
    }


}
