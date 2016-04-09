package com.ita.week6.api;

import java.io.IOException;

/**
 * Created by deividi.silva on 30/03/2016.
 */
public interface GameEngine {

    public String game(String originalWord, String typedWord) throws IOException;
}
