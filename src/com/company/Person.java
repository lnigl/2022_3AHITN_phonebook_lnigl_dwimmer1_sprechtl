package com.company;

import java.util.Date;

/*
@autor  :  dwimmer1
 */

/*
Klasse: Person
In der Klasse werden die Daten zu jeweiligen Personen initialisiert
 */

public class Person {

    String name;
    String givename;
    String nickname;
    Date birthday;
    PhoneNumber phone;

    /**
     * Funktionsbeschreibung
     * public Person dient als Konstruktor
     * @param    n String für den namen
     * @param    gn String für givename
     * @param    bd geburtsdatum
     * @param    p Telefonnummer
     * @return 	void
     */
    public Person(String n, String gn, Date bd, PhoneNumber p) {
        this.name = n;
        this.givename = gn;
        this.birthday = bd;
        this.phone = p;
    }
    /**
     * Funktionsbeschreibung
     * toString
     * @return 	String
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", givename='" + givename + '\'' +
                ", nickname='" + nickname + '\'' +
                ", birthday=" + birthday +
                ", phone=" + phone +
                '}';
    }
}
