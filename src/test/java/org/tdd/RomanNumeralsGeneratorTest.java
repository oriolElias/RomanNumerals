package org.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RomanNumeralsGeneratorTest {

    RomanNumeralsGenerator generator;

    @Test
    void generateRomanNumeralI(){
        generator = new RomanNumeralsGenerator();
        assertEquals("I",generator.romanFor(1));
    }

    @Test
    void generateRomanNumeralII(){
        generator = new RomanNumeralsGenerator();
        assertEquals("II",generator.romanFor(2));
    }
    @Test
    void generateRomanNumeralIII(){
        generator = new RomanNumeralsGenerator();
        assertEquals("III",generator.romanFor(3));
    }

    @Test
    void generateRomanNumberV(){

    }



}