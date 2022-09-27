package org.tdd;

public class RomanNumeralsGenerator {
    public String romanFor(int decimal) {
        StringBuilder roman = new StringBuilder();
        roman.append("I");
        if(decimal==2){
            roman.append("I");
        }
        return roman.toString();
    }
}
