package com.ita.week6.impl.engine;

import com.ita.week6.WordTrunk;
import com.ita.week6.api.GameEngine;

import java.io.IOException;

/**
 * Created by User on 03/04/2016.
 */
public class WordTranslate implements GameEngine {

    @Override
    public String game(String wordFromTrunk, String typedWord) {
        getTranslatedWord(wordFromTrunk);

        if (getTranslatedWord(wordFromTrunk).equalsIgnoreCase(typedWord)) {
                return "Você ganhou, parabéns!";
            } else {
                return "Você perdeu.";
            }
    }

    private String getTranslatedWord(String wordFromTrunk) {
        WordTrunk wordTrunk = new WordTrunk();
        try {
            return wordTrunk.readTranslatedWord(wordFromTrunk);
        } catch (IOException e) {
            return "";
        }
    }

}
