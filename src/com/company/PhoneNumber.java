package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private final int country;
    private final int areacode;
    private final int number;

    public PhoneNumber(int country, int areacode, int number) throws IllegalPhoneNumberException {
        if (country < 1 || country > 99){
            throw new IllegalPhoneNumberException(IllegalPhoneNumberException.COUNTRY_ILLEGAL);
        }
        this.country = country;

        if(Integer.toString(areacode).length() != 4){
            throw new IllegalPhoneNumberException(IllegalPhoneNumberException.AREA_ILLEGAL);
        }
        this.areacode = areacode;

        if (Integer.toString(number).length() != 6 && Integer.toString(number).length() != 8){
            throw new IllegalPhoneNumberException(IllegalPhoneNumberException.NUMBER_ILLEGAL);
        }
        this.number = number;
    }

    public PhoneNumber(String phoneNumber) throws IllegalPhoneNumberException {
        Pattern pattern = Pattern.compile("\\d[2] \\d[4]/\\d[6-8]");
        Matcher matcher = pattern.matcher(phoneNumber);


        if (!matcher.matches()){
            throw new IllegalPhoneNumberException(IllegalPhoneNumberException.STRING_FORMAT_ILLEGAL);
        }

        country = Integer.parseInt(phoneNumber.split(" ")[1]);
        areacode = Integer.parseInt(phoneNumber.split(" ")[2].split("/")[0]);
        number = Integer.parseInt(phoneNumber.split(" ")[2].split("/")[1]);
    }

    public int getCountry() {
        return country;
    }

    public int getAreacode() {
        return areacode;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "+" + country + " " + areacode + "/" + number;
    }

    public static boolean isValid(String phoneNumber) throws IllegalPhoneNumberException {
        Pattern pattern = Pattern.compile("\\d[2] \\d[4]/\\d[6-8]");
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean isValid = true;

        int country = -1;
        int areacode = -1;
        int number = -1;

        if (matcher.matches()){
            country = Integer.parseInt(phoneNumber.split(" ")[1]);
            areacode = Integer.parseInt(phoneNumber.split(" ")[2].split("/")[0]);
            number = Integer.parseInt(phoneNumber.split(" ")[2].split("/")[1]);
        }else{
            isValid=false;
        }


        if (isValid && (country < 1 || country > 99)){
            throw new IllegalPhoneNumberException(IllegalPhoneNumberException.COUNTRY_ILLEGAL);
        }

        if(Integer.toString(areacode).length() != 4){
            throw new IllegalPhoneNumberException(IllegalPhoneNumberException.AREA_ILLEGAL);
        }

        if (Integer.toString(number).length() != 6 && Integer.toString(number).length() != 8){
            throw new IllegalPhoneNumberException(IllegalPhoneNumberException.NUMBER_ILLEGAL);
        }

        return isValid;
    }
}
