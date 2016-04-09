package com.ita.week6.impl.shuffle;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by User on 09/04/2016.
 */
public class BackwardShuffleTest {
    @Test
    public void shuffleWord() throws Exception {
        BackwardShuffle shuffler = new BackwardShuffle();
        assertThat("aguratrat", equalTo(shuffler.shuffleWord("tartaruga")));
    }

}