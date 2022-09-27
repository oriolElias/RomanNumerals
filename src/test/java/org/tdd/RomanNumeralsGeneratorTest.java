package org.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RomanNumeralsGeneratorTest {

    RomanNumeralsGenerator generator;

    @BeforeEach
    void setUpGenerator(){
        generator = new RomanNumeralsGenerator();
    }
    @Test
    void generateRomanNumeralI(){

        assertEquals("I",generator.romanFor(1));
    }

    @Test
    void generateRomanNumeralII(){

        assertEquals("II",generator.romanFor(2));
    }
    @Test
    void generateRomanNumeralIII(){

        assertEquals("III",generator.romanFor(3));
    }

    @Test
    void generateRomanNumberV(){
        assertEquals("V",generator.romanFor(5));
    }



}