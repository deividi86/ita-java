package com.ita.week5;

/**
 * Created by deividi.silva on 29/03/2016.
 */
public class HonorificTitleName implements NameFormatter {

    private String title;

    public HonorificTitleName(String title){
        this.title = title;
    }

    @Override
    public String formatName(String name, String lastName) {
        return this.title + " " + name + " " + lastName;
    }
}
