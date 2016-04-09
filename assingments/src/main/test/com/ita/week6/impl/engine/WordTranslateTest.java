package com.ita.week6.impl.engine;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by User on 09/04/2016.
 */
public class WordTranslateTest {

    @Test
    public void gameWrongAnswerTest() throws Exception {
        WordTranslate wordGuess = new WordTranslate();

        assertThat("Você perdeu.", equalTo(wordGuess.game("mouse", "gato")));
    }

    @Test
    public void gameCorrectAnswerTest() throws Exception {
        WordTranslate wordGuess = new WordTranslate();

        assertThat("Você ganhou, parabéns!", equalTo(wordGuess.game("mouse", "rato")));
    }

}