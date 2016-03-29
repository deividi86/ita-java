package com.ita.week5;

/**
 * Created by deividi.silva on 28/03/2016.
 */
public class Authority {

    public Authority(NameFormatter nameFormatter, String name, String lastName){
        this.name = name;
        this.lastName = lastName;
        this.nameFormatter = nameFormatter;
    }

    private String name;
    private String lastName;
    private NameFormatter nameFormatter;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTreatment(){
        return nameFormatter.formatName(this.getName(), this.getLastName());
    }
}
