package com.ita.week6.impl.shuffle;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by User on 09/04/2016.
 */
public class RandomShuflleTest {

    @Test
    public void shuffleWord() throws Exception {
        RandomShuffle shuffler = new RandomShuffle();
        String word = "tartaruga";
        String shuffledWord = shuffler.shuffleWord("tartaruga");

        assertThat(word.length(), equalTo(shuffledWord.length()));
    }
}