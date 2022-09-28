package org.tdd;

import java.util.List;

public class RomanNumeralsGenerator {
    public String romanFor(int decimal) {
        String roman = "";

        for (RomanToDecimal romanToDecimal: RomanToDecimal.values()) {
            while(decimal>=romanToDecimal.decimal){
                roman += romanToDecimal.roman;
                decimal -=romanToDecimal.decimal;
            }
        }

        return roman;
    }



    String[] romanNumber = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    int[] decimalNumbers = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

    public String converter(int decimalToTransform){
        String roman = "";

        for (int i = 0; i < decimalNumbers.length; i++) {
            while(decimalToTransform>=decimalNumbers[i]){
                roman+=romanNumber[i];
                decimalToTransform-=decimalNumbers[i];
            }
        }

        return roman;
    }

    enum RomanToDecimal{
        THOUSAND("M",1000),
        NINE_HUNDRED("CM",900),
        FIVE_HUNDRED("D",500),
        FOUR_HUNDRED("CD",400),
        HUNDRED("C",100),
        NINETY("XC",90),
        FIFTY("L",50),
        FORTY("XL",40),
        TEN("X",10),
        NINE("IX",9),
        FIVE("V",5),
        FOUR("IV",4),
        ONE("I",1);
        private final String roman;
        private final int decimal;
        RomanToDecimal(String roman, int decimal){
            this.roman = roman;
            this.decimal = decimal;
        }
    }
}
