package com.ita.week6.factory;

import com.ita.week6.api.GameEngine;
import com.ita.week6.impl.engine.SuddenDeath;
import com.ita.week6.impl.engine.ThreeShots;

/**
 * Created by deividi.silva on 30/03/2016.
 */
public class GameEngineFactory {

    private int gameMode;
    private String word;
    private String answer;

    public GameEngine gameEngine;

    public String getEngine(){
        if(gameMode == 1)
            return new SuddenDeath(word, answer).game();
        else {
            int c = 0;
            do {

            } while(c < 3);
            return new ThreeShots(word, answer).game();
        }
    }
}
