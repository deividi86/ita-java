package com.ita.week6.impl.engine;

import com.ita.week6.api.GameEngine;

/**
 * Created by User on 03/04/2016.
 */
public class WordGuess implements GameEngine {

    @Override
    public String game(String wordFromTrunk, String typedWord) {
        if(typedWord.equalsIgnoreCase(wordFromTrunk)){
            return "Você ganhou, parabéns!";
        } else {
            return "Você perdeu.";
        }
    }
}
