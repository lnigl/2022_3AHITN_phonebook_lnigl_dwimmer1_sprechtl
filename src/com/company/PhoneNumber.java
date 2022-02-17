package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private final int country;
    private final int areacode;
    private final int number;

    public PhoneNumber(int country, int areacode, int number) throws IllegalPhoneNumberException {
        if (isValidCountryPart(country)){
            throw new IllegalPhoneNumberException(IllegalPhoneNumberException.COUNTRY_ILLEGAL);
        }
        this.country = country;

        if(!isValidAreaPart(areacode)){
            throw new IllegalPhoneNumberException(IllegalPhoneNumberException.AREA_ILLEGAL);
        }
        this.areacode = areacode;

        if (!isValidNumberPart(number)){
            throw new IllegalPhoneNumberException(IllegalPhoneNumberException.NUMBER_ILLEGAL);
        }
        this.number = number;
    }

    public PhoneNumber(String phoneNumber) throws IllegalPhoneNumberException {
        Pattern pattern = Pattern.compile("(\\+|00)\\d{2} \\d{4}\\/(\\d{6}|\\d{8})");
        Matcher matcher = pattern.matcher(phoneNumber);

        if (!matcher.matches()){
            throw new IllegalPhoneNumberException(IllegalPhoneNumberException.STRING_FORMAT_ILLEGAL);
        }

        country = Integer.parseInt(phoneNumber.split(" ")[1]);
        areacode = Integer.parseInt(phoneNumber.split(" ")[2].split("/")[0]);
        number = Integer.parseInt(phoneNumber.split(" ")[2].split("/")[1]);
    }

    private static boolean isValidCountryPart(int c){
        return c > 1 && c < 99;
    }
    private static boolean isValidAreaPart(int a){
        return Integer.toString(a).length() == 4;
    }
    private static boolean isValidNumberPart(int n){
        return Integer.toString(n).length() == 6 || Integer.toString(n).length() == 8;
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

    public static boolean isValid(String phoneNumber) {
        Pattern pattern = Pattern.compile("(\\+|00)\\d{2} \\d{4}\\/(\\d{6}|\\d{8})");
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean isValid;

        int country;
        int areacode;
        int number;

        if (matcher.matches()){
            country = Integer.parseInt(phoneNumber.split(" ")[0]);
            areacode = Integer.parseInt(phoneNumber.split(" ")[1].split("/")[0]);
            number = Integer.parseInt(phoneNumber.split(" ")[1].split("/")[1]);
            isValid = isValidCountryPart(country) && isValidAreaPart(areacode) && isValidNumberPart(number);
        }else{
            isValid=false;
        }

        return isValid;
    }
}
