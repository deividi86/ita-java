package com.ita.week6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
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
        int n = rand.nextInt(19) + 1;

        return Files.readAllLines(Paths.get("C:/workspace/ita-java/assingments/words.txt")).get(n);
    }
}
