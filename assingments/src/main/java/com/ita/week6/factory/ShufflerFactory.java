package com.ita.week6.factory;

import com.ita.week6.api.Shuffler;
import com.ita.week6.impl.shuffle.BackwardShuffle;
import com.ita.week6.impl.shuffle.RandomShuffle;

import java.util.Random;

/**
 * Created by deividi.silva on 30/03/2016.
 */
public class ShufflerFactory {

    public Shuffler getShuffler(){
        Random rand = new Random();
        int n = rand.nextInt(1) + 1;

        if(n==1){
            return new BackwardShuffle();
        } else {
            return new RandomShuffle();
        }

    }
}
