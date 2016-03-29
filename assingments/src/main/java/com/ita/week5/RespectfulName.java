package com.ita.week5;

/**
 * Created by deividi.silva on 29/03/2016.
 */
public class RespectfulName implements NameFormatter {

    private String sex;

    public RespectfulName(String sex){
        if("male".equals(sex)){
            this.sex = "Sr.";
        } else if("female".equals(sex)){
            this.sex = "Sra.";
        }
    }

    @Override
    public String formatName(String name, String lastName) {
        return this.sex + " " + lastName;
    }
}
