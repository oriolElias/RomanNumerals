package org.tdd;

public class RomanNumeralsGenerator {
    public String romanFor(int decimal) {
        String roman = "";

        for (RomanToDecimal romanToDecimal: RomanToDecimal.values()) {
            if(decimal>=romanToDecimal.decimal){
                roman += romanToDecimal.roman;
                decimal -=romanToDecimal.decimal;
            }
        }


        for (int i = 0; i < decimal; i++) {
            roman += "I";
        }


        return roman;
    }

    enum RomanToDecimal{
        TEN("X",10),
        FIVE("V",5);
        private final String roman;
        private final int decimal;
        RomanToDecimal(String roman, int decimal){
            this.roman = roman;
            this.decimal = decimal;
        }
    }
}
