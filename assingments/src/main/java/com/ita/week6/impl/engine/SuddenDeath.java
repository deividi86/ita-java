package com.ita.week6.impl.engine;

import com.ita.week6.api.GameEngine;

/**
 * Created by User on 03/04/2016.
 */
public class SuddenDeath implements GameEngine {
    private String word;
    private String answer;

    public SuddenDeath(String word, String answer) {
        this.word = word;
        this.answer = answer;
    }

    @Override
    public String game() {
        if(word.equals(answer)){
            return "Você ganhou, parabéns!";
        } else {
            return "Você perdeu.";
        }

    }
}
