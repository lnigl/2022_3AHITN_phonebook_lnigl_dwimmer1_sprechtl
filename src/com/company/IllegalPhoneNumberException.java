package com.company;

/*-----------------------------------------------------------------------------
 *              Hoehere Technische Bundeslehranstalt STEYR
 *           Fachrichtung Elektronik und Technische Informatik
 *----------------------------------------------------------------------------*/
/**
 * IllegalPhoneNumberException
 *
 * @author  : Stefan Prechtl
 * @date    : 04.03.2022
 *
 * @details
 *   Wird geworfen, falls etwas bei der Erstellung einer PhoneNumber schiefgeht.
 *
 */
public class IllegalPhoneNumberException extends Exception{
    private final int type;
    public static final int COUNTRY_ILLEGAL = 1;
    public static final int AREA_ILLEGAL = 2;
    public static final int NUMBER_ILLEGAL = 3;
    public static final int STRING_FORMAT_ILLEGAL = 4;

    /**
     * Konstruktor
     * @param type Gibt an, um welche Type es sich handelt.
     */
    public IllegalPhoneNumberException(int type) {
        this.type = type;
    }

    /**
     * @return Type der Exception.
     */
    public int getType() {
        return type;
    }
}
