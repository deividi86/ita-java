package com.ita.week6.impl.shuffle;

import com.ita.week6.api.Shuffler;

/**
 * Created by User on 03/04/2016.
 */
public class BackwardShuffle implements Shuffler{

    @Override
    public String shuffleWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
