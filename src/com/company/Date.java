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
        int i = 1;
        //teilen und int

        String[] test = d.split("[.]", 0);
        for(String myStr: test) {
            if(i == 1){
                //d=myStr;
            }else if(i == 2){
                //m=myStr;
            }else{
                //y=myStr;
            }
            i++;
        }
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
