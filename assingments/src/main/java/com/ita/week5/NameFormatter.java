package com.ita.week5;

/**
 * Created by deividi.silva on 28/03/2016.
 */
public interface NameFormatter {

    String formatName(String name, String lastName);

    String informalName(String name);

    String respectfulName(String sex);

    String withTitle(String title);
}
