package com.ita.week6.impl.engine;

import com.ita.week6.api.GameEngine;

/**
 * Created by User on 03/04/2016.
 */
public class ThreeShots implements GameEngine {

    private String word;
    private String answer;

    public ThreeShots(String word, String answer) {
        this.word = word;
        this.answer = answer;
    }

    @Override
    public String game() {
        if(word.equals(answer)){
            return "Você ganhou, parabéns!";
        } else {
            return "Errado, mais uma chance!";
        }

    }
}
