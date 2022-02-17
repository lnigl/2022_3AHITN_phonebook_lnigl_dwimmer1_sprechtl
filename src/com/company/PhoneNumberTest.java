package com.company;

import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberTest {

    @org.junit.jupiter.api.Test
    void isValid1() {
        assertTrue(PhoneNumber.isValid("+43 6606/149920"));
    }

    @org.junit.jupiter.api.Test
    void isValid2() {
        assertTrue(PhoneNumber.isValid("0043 6606/149920"));
    }

    @org.junit.jupiter.api.Test
    void isValid3() {
        assertFalse(PhoneNumber.isValid("1231243 66026/1499320"));
    }

    @org.junit.jupiter.api.Test
    void illegal1(){
        assertThrows(IllegalPhoneNumberException.class, () -> new PhoneNumber(123, 1, 123));
    }

    @org.junit.jupiter.api.Test
    void illegal2(){
        assertThrows(IllegalPhoneNumberException.class, () -> new PhoneNumber(43, 1123, 12313));
    }

    @org.junit.jupiter.api.Test
    void illegal3(){
        assertThrows(IllegalPhoneNumberException.class, () -> new PhoneNumber("123123"));
    }


}