package org.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @Test
    void generateRomanNumberVII(){
        assertEquals("VII",generator.romanFor(7));
    }

    @Test
    void generateRomanNumberX(){
        assertEquals("X",generator.romanFor(10));
    }

    @Test
    void generateRomanNumberXVIII(){
        assertEquals("XVIII",generator.romanFor(18));
    }

    @Test
    void generateRomanNumberXXX(){
        assertEquals("XXX",generator.romanFor(30));
    }

    @Test
    void generateRomanNumberIV(){
        assertEquals("IV",generator.romanFor(4));
    }
    @Test
    void generateRomanNumberIX(){
        assertEquals("IX",generator.romanFor(9));
    }

    @Test
    void generateRomanNumberMMDCLXXXVII(){
        assertEquals("MMDCLXXXVII",generator.romanFor(2687));
    }

    @Test
    void generateRomanNumberMMMCDXCIX(){
        assertEquals("MMMCDXCIX",generator.romanFor(3499));
    }

    @ParameterizedTest
    @CsvSource(value = {"1,'I'","5,'V'","9,'IX'","10,'X'","54,'LIV'","70, 'LXX'","100,'C'","500,'D'","1000,'M'","1250,'MCCL'"})
    void generateRomanNumberWithConverter(int number,String roman){
        assertEquals(roman,generator.converter(number));
    }

}