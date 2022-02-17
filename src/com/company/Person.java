package com.company;

import java.util.Date;

/*
@autor  :  dwimmer1
 */

public class Person {

    String name;
    String givename;
    String nickname;
    Date birthday;
    PhoneNumber phone;



    public Person(String n, String gn, Date bd, PhoneNumber p) {
        this.name = n;
        this.givename = gn;
        this.birthday = bd;
        this.phone = p;
    }

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
