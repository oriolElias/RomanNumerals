package org.tdd;

public class RomanNumeralsGenerator {
    public String romanFor(int decimal) {
        String roman = "";
        for (int i = 0; i < decimal; i++) {
            roman += "I";
        }


        return roman;
    }
}
