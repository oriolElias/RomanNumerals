package org.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RomanNumeralsGeneratorTest {

    RomanNumeralsGenerator generator;

    @Test
    void generateRomanNumeralForBaseDecimal(){
        generator = new RomanNumeralsGenerator();
        assertEquals("I",generator.romanFor(1));
    }

}