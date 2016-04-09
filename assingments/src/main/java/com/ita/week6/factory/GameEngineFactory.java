package com.ita.week6.factory;

import com.ita.week6.api.GameEngine;
import com.ita.week6.impl.engine.WordGuess;
import com.ita.week6.impl.engine.WordTranslate;

/**
 * Created by deividi.silva on 30/03/2016.
 */
public class GameEngineFactory {

    private int gameMode;
    private String answer;
    private String typedWord;

    public GameEngineFactory(int gameMode, String answer, String typedWord){
        this.gameMode = gameMode;
        this.answer = answer;
        this.typedWord = typedWord;
    }

    public GameEngine getEngine(){
        if(gameMode == 1)
            return new WordGuess();
        else {
            return new WordTranslate();
        }
    }
}
