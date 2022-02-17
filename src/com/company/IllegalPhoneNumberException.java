package com.company;

public class IllegalPhoneNumberException extends Exception{
    public int type;
    public static final int COUNTRY_ILLEGAL = 1;
    public static final int AREA_ILLEGAL = 2;
    public static final int NUMBER_ILLEGAL = 3;
    public static final int STRING_FORMAT_ILLEGAL = 4;

    public IllegalPhoneNumberException(int type) {
        this.type = type;
    }
}
