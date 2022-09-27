package org.tdd;

public class RomanNumeralsGenerator {
    public String romanFor(int decimal) {
        String roman = "";
        if(decimal>=10){
            roman += "X";
            decimal -=10;
        }
        if(decimal >= 5){
            roman += "V";
            decimal -= 5;
        }
        for (int i = 0; i < decimal; i++) {
            roman += "I";
        }


        return roman;
    }
}
