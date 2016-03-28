package com.ita.week5;

/**
 * Created by deividi.silva on 28/03/2016.
 */
public class Authority {

    public Authority(String name, String lastName, String title, String sex){
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.title = title;

    }
    private String name;
    private String lastName;
    private String sex;
    private String title;

    private NameFormatter nameFormatter = new NameFormatter() {

        @Override
        public String formatName(String name, String lastName) {
            return null;
        }

        @Override
        public String informalName(String name) {
            return name;
        }

        @Override
        public String respectfulName(String sex) {
            if("male".equals(sex)){
                return "Sr. " + getLastName();
            } else if("female".equals(sex)){
                return "Sra. " + getLastName();
            } else {
                return getLastName();
            }
        }

        @Override
        public String withTitle(String title){
            return title + " " + getName() + " " + getLastName();
        }
    };

    public NameFormatter getTitle() {
        return nameFormatter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
