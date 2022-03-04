package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*-----------------------------------------------------------------------------
 *              Hoehere Technische Bundeslehranstalt STEYR
 *           Fachrichtung Elektronik und Technische Informatik
 *----------------------------------------------------------------------------*/
/**
 * PhoneNumber
 *
 * @author  : Stefan Prechtl
 * @date    : 04.03.2022
 *
 * @details
 *   PhoneNumber mit Exceptionhandling für die Prüfung der Richtigkeit einer Telefonnummer.
 *
 */
public class PhoneNumber {
    private final int country;
    private final int areacode;
    private final int number;

    /**
     * Konstruktor
     * @param country Landteil
     * @param areacode Umgebungsteil
     * @param number Ziffernteil
     * @throws IllegalPhoneNumberException Falls einer der Parameter nicht richtig ist.
     */
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

    /**
     * @param phoneNumber Vollständige Telefonnummer innerhalb eines Strings.
     * @throws IllegalPhoneNumberException Falls eine der Teile der Telefonnummer inkorrekt ist.
     */
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

    /**
     * @param c Landteil
     * @return c zwischen 0 und 100
     */
    private static boolean isValidCountryPart(int c){
        return c > 0 && c < 99;
    }

    /**
     * @param a Umgebungsteil
     * @return a ist 4 Zeichen lang
     */
    private static boolean isValidAreaPart(int a){
        return Integer.toString(a).length() == 4;
    }

    /**
     * @param n Ziffernteil
     * @return n ist 6 bzw. 8 zeichen Lang
     */
    private static boolean isValidNumberPart(int n){
        return Integer.toString(n).length() == 6 || Integer.toString(n).length() == 8;
    }

    /**
     * @return Landteil
     */
    public int getCountry() {
        return country;
    }

    /**
     * @return Umgebungsteil
     */
    public int getAreacode() {
        return areacode;
    }

    /**
     * @return Ziffernteil
     */
    public int getNumber() {
        return number;
    }

    /**
     * @return String ausgabe der PhoneNumber (z.B.: "+43 6606/049919").
     */
    @Override
    public String toString() {
        return "+" + country + " " + areacode + "/" + number;
    }

    /**
     * @param phoneNumber Vollständige Telefonnummer innerhalb eines Strings.
     * @return ob die Telefonnummer richtig.
     */
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
