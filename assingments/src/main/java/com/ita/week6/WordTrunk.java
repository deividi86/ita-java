package com.ita.week6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by deividi.silva on 30/03/2016.
 */
public class WordTrunk {

    public String readWord() throws IOException {
        Random rand = new Random();
        int n = rand.nextInt(37) + 1;

        if(n % 2 != 0) {
            n++;
        }

        return Files.readAllLines(Paths.get("C:/workspace/ita-java/assingments/words.txt")).get(n);
    }

    public String readTranslatedWord(String translatedWord) throws IOException {
        String result = "";
        final Scanner scanner = new Scanner(Paths.get("C:/workspace/ita-java/assingments/words.txt"));
        while (scanner.hasNextLine()) {
            final String lineFromFile = scanner.nextLine();
            if(lineFromFile.contains(translatedWord)) {
                return scanner.nextLine();
            }
        }
        return "";
    }
}
