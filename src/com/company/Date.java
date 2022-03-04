package com.company;

public class Date {

    private int day;
    private int mon;
    private int year;

    /**
     * Im ersten Konstruktor werden Tag, Monat und Jahr vom Main eingelesen und in eigene Variablen gespeichert.
     * @param d Tag
     * @param m Monat
     * @param y Jahr
     */
    public Date(int d, int m, int y) {
        this.day = d;
        this.mon = m;
        this.year = y;
    }

    /**
     * Im zweiten Konstruktor werden Tag, Monat und Jahr anhand von Punkten getrennt und in eigene Variablen gespeichert.
     * @param d String der im Main angegeben wird mit der Form DD.MM.YY
     */

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

    /**
     * Getter-Funktion fuer private Variable day
     * @return day Variable
     */
    public int getDay() {
        return day;
    }

    /**
     * Getter-Funktion fuer private Variable mon
     * @return mon Variable
     */
    public int getMon() {
        return mon;
    }

    /**
     * Getter-Funktion fuer private Variable year
     * @return year Variable
     */
    public int getYear() {
        return year;
    }

    /**
     * Diese Funktion prueft ob das Jahr ein Schaltjahr ist
     * @return wenn es ein Schaltjahr ist wird true zurückgegeben sonst false
     */
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

    /**
     * Diese Funbktion prueft auf die Richtigkeit der Daten
     * @param day der zu pruefende Tag
     * @param mon das zu pruefende Monat
     * @return true fuer richtiges Format, false fuer falsches
     */
    public boolean isValid(int day, int mon) {


        if (day > 31 || day < 0 || mon > 12 || mon < 0){
            return false;
        } else if(mon == 2 && day > 29){
            return false;
        }else{
            return true;
        }

    }
}
