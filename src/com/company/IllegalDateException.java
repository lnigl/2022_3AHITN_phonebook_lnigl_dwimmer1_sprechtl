package com.company;

public class IllegalDateException extends Exception {
    private final int type;
    public static final int DAY_ILLEGAL = 1;
    public static final int MON_ILLEGAL = 0;

    public IllegalDateException(int type){
        this.type = type;
    }

    public int getType(){
        return type;
    }


}
