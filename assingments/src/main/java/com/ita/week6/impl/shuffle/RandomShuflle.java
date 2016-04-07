package com.ita.week6.impl.shuffle;

import com.ita.week6.api.Shuffler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by User on 03/04/2016.
 */
public class RandomShuflle implements Shuffler {

    @Override
    public String shuffleWord(String word) {
        List<String> arrayFromWord = new ArrayList<>();
        arrayFromWord.add(word);
        Collections.shuffle(arrayFromWord);
        return arrayFromWord.toString();
    }
}
