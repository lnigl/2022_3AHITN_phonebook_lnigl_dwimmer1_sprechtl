package com.company;

public class Date {

    private int day;
    private int mon;
    private int year;

    public Date(int d, int m, int y){
        this.day = d;
        this.mon = m;
        this.year = y;
    }

    public Date (String d){
        //teilen und int
    }

    public int getDay() {
        return day;
    }

    public int getMon() {
        return mon;
    }

    public int getYear() {
        return year;
    }

    public boolean isLeapYear(){
        return;
    }

    public boolean isValid(Date d){
        return;
    }
}
