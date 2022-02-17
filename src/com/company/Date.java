package com.company;

public class Date {

    private int day;
    private int mon;
    private int year;

    public Date(int d, int m, int y) {
        this.day = d;
        this.mon = m;
        this.year = y;
    }

    public Date(String d) {
        int i = 1;
        //teilen und int

        String[] test = d.split("[.]", 0);
        for (String myStr : test) {
            if (i == 1) {
                day = Integer.parseInt(myStr);
                //day = myStr;
            } else if (i == 2) {
                mon = Integer.parseInt(myStr);
                //mon = myStr;
            } else {
                year = Integer.parseInt(myStr);
                //year = myStr;
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

    public boolean isLeapYear() {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }

    }

    public boolean isValid(Date d) {


        if (d.day > 31 || d.day < 0 || d.mon > 12 || d.mon < 0){
            return false;
        } else if(d.mon == 2 && d.day > 29){
            return false;
        }else{
            return true;
        }

        // aufräumen
    }
}
