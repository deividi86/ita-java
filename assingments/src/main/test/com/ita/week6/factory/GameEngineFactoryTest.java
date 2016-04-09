package com.ita.week6.factory;

import com.ita.week6.impl.engine.WordGuess;
import com.ita.week6.impl.engine.WordTranslate;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

/**
 * Created by User on 09/04/2016.
 */
public class GameEngineFactoryTest {
    @Test
    public void getTranslateEngine() throws Exception {
        GameEngineFactory gameEngineFactory = new GameEngineFactory(2, "teste", "teste");

        assertThat(gameEngineFactory.getEngine(), instanceOf(WordTranslate.class));
    }

    @Test
    public void getGuessEngine() throws Exception {
        GameEngineFactory gameEngineFactory = new GameEngineFactory(1, "teste", "teste");

        assertThat(gameEngineFactory.getEngine(), instanceOf(WordGuess.class));
    }
}