package com.ita.week6;

import com.ita.week6.api.GameEngine;
import com.ita.week6.api.Shuffler;
import com.ita.week6.factory.GameEngineFactory;
import com.ita.week6.factory.ShufflerFactory;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by deividi.silva on 30/03/2016.
 */
public class Main {

    public static void main(String[] args) {
        gameMenu();
        menuInteraction();
    }

    private static void menuInteraction() {
        int swValue;
        String typedWord;
        Scanner in = new Scanner(System.in);
        swValue = in.nextInt();
        String wordFromTrunk = getWordFromTrunk();
        String shuffledWord = shuffleWord(wordFromTrunk);


        switch (swValue) {
            case 1:
                System.out.println("Identificar a palavra");
                System.out.println("Acerte o nome do animal em inglês!");
                System.out.println(shuffledWord);
                typedWord = in.next();
                System.out.println(playGame(1, wordFromTrunk, typedWord));
                System.out.println("Jogar novamente? (s/n)");
                restartGame(in);
            case 2:
                System.out.println("Tradução");
                System.out.println("Acerte o nome do animal traduzindo-o para português!");
                System.out.println(shuffledWord);
                typedWord = in.next();
                System.out.println(playGame(2, wordFromTrunk, typedWord));
                System.out.println("Jogar novamente? (s/n)");
                restartGame(in);
            case 3:
                System.out.println("Tchau!");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    private static void restartGame(Scanner in) {
        String playAgain;
        playAgain = in.next();
        if("s".equalsIgnoreCase(playAgain)){
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            gameMenu();
            menuInteraction();
        } else {
            System.out.println("Tchau!");
            System.exit(1);
        }
    }

    private static void gameMenu() {
        System.out.println("=========================================");
        System.out.println("|         PALAVRAS EMBARALHADAS         |");
        System.out.println("-----------------------------------------");
        System.out.println("|      Nomes de animais em inglês       |");
        System.out.println("-----------------------------------------");
        System.out.println("|           Modos de jogo:              |");
        System.out.println("|             1. Acerte em inglês       |");
        System.out.println("|             2. Traduza a palavra      |");
        System.out.println("|             3. Sair                   |");
        System.out.println("=========================================");
    }

    private static String playGame(int gameMode, String wordFromTrunk, String typedWord) {
        GameEngineFactory gameEngineFactory = new GameEngineFactory(gameMode, wordFromTrunk, typedWord);
        String result = "";
        try {
            result = gameEngineFactory.getEngine().game(wordFromTrunk, typedWord);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static String shuffleWord(String wordFromTrunk) {
        Shuffler shuffler = new ShufflerFactory().getShuffler();
        return shuffler.shuffleWord(wordFromTrunk);
    }

    private static String getWordFromTrunk() {
        WordTrunk wordTrunk = new WordTrunk();
        try {
            return wordTrunk.readWord();
        } catch (IOException e) {
            return "Word not found!";
        }
    }
}


