package com.endava.enums;

/**
 * Created by lex on 18.03.2017.
 */

public enum CarBrands {
    Toyota, BMW, Audi, Ford, Skoda;

    public CarBrands getNext() {
        return this.ordinal() < CarBrands.values().length - 1
                ? CarBrands.values()[this.ordinal() + 1]
                : null;
    }

    public CarBrands getPrevious() {
        return this.ordinal() < CarBrands.values().length - 1
                ? CarBrands.values()[this.ordinal() - 1]
                : null;
    }

    public static void showAll() {
        for (CarBrands cb : CarBrands.values())
            System.out.println(cb.name());
    }
}


