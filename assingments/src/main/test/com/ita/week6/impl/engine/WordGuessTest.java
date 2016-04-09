package com.ita.week6.impl.engine;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by User on 09/04/2016.
 */
public class WordGuessTest {

    @Test
    public void gameWrongAnswerTest() throws Exception {
        WordGuess wordGuess = new WordGuess();

        assertThat("Você perdeu.", equalTo(wordGuess.game("mouse", "house")));
    }

    @Test
    public void gameCorrectAnswerTest() throws Exception {
        WordGuess wordGuess = new WordGuess();

        assertThat("Você ganhou, parabéns!", equalTo(wordGuess.game("mouse", "mouse")));
    }
}