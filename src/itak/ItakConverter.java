package itak;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;

public class ItakConverter {
    StringBuilder tobeParsed = new StringBuilder();
    private static biTable kakatanaToModKunrei;
    private final String VOWEL = "[aeiou]";
    private final String CONSONANTS = "[bcdfghjklmnpqrstvwxyz]";
    private final String NUMS = "[0-9]";
    biTable reference;
    public ItakConverter(String line) {
        tobeParsed.append(line);
        reference = getkatakanaToModKunreiTable();
    }
    
    public String Convert() {
        StringBuilder converted = new StringBuilder();
        while (tobeParsed.length() != 0) {
            String temp = tobeParsed.substring(0, 1);
            int switchNum = 0, nextIndex = 1;
            if (temp.matches(VOWEL)) {
            } else if (temp.matches(CONSONANTS)){
                switchNum = 1;
            } else {
                switchNum = 2; 
            }
            
            switch(switchNum) {
            /* Vowel case */
            case 0:
                converted.append(reference.getInverseVal(temp));
                //if (tobeParsed.length() == 1
                //    || tobeParsed.substring(nextIndex, nextIndex + 1).matches(CONSONANTS)
                //   || tobeParsed.substring(nextIndex, nextIndex + 1).matches("\\W")) {
                //} else {
                    //if (!tobeParsed.substring(nextIndex, nextIndex + 1).equals(temp)) {
                    //} else {
                        //System.out.println(tobeParsed.length());
                        //while (tobeParsed.length() > nextIndex && String.valueOf(tobeParsed.charAt(nextIndex)).equals(temp)) {
                            //System.out.println("loop char: " + tobeParsed.charAt(nextIndex));
                        //    converted.append(reference.getInverseVal("onbiki"));
                        //    nextIndex++;
                            //System.out.println("loop #: " + nextIndex);
                        //}
                    nextIndex = theYCondition(tobeParsed, converted, nextIndex, temp, "v");
                    nextIndex = vowelChainCheck(tobeParsed, converted, temp);
                   // }
                //}
                System.out.println("vowel");
                //System.out.println(nextIndex);
                break;
            /* Consonant case */
            case 1:
                if (tobeParsed.length() > 1) {

                    String nextChar = String.valueOf(tobeParsed.charAt(nextIndex));
                    String combo = temp + nextChar;

                    if (nextChar.matches(VOWEL)) {

                        String i = String.valueOf(tobeParsed.charAt(nextIndex));
                        converted.append(reference.getInverseVal(temp + i));
                        tobeParsed.delete(0, 1);
                        nextIndex = vowelChainCheck(tobeParsed, converted, i);

                    } else if (temp.equals(nextChar)) {
                        converted.append(reference.getInverseVal("sokuon"));
                    /* the char is a y */
                    } else if (nextChar.equals("y")) {
                        nextIndex = theYCondition(tobeParsed, converted, nextIndex, temp, "c");
                    /* special cases, ng, sh, ch, and ts */
                    } else if (combo.equals("ng") ||combo.equals("sh")|| combo.equals("ch")
                        || combo.equals("ts"))  {

                        if (tobeParsed.length() > nextIndex + 1
                            && String.valueOf(tobeParsed.charAt(nextIndex + 1)).matches(VOWEL)) {

                            String nextnextChar = String.valueOf(tobeParsed.charAt(nextIndex + 1));
                            nextIndex+=2;

                            if (combo.equals("ng")) {
                                converted.append(reference.getInverseVal(temp));
                                nextIndex-=2;
                            } else {
                                converted.append(reference.getInverseVal(combo + nextnextChar));
                            }
                        } else {
                            if ((temp + nextChar).equals("ts")) {
                                converted.append(reference.getInverseVal("sokuon"));
                                nextIndex++;
                            } else {
                                converted.append(reference.getInverseVal(temp));
                            }
                        }
                    } else if (temp.equals("y")) {
                        converted.append(reference.getInverseVal("xi"));
                    /* everything else aka none katakanas */  
                    } else {
                        converted.append(reference.getInverseVal(temp));
                    }
                } else if (temp.equals("y")) {
                    converted.append(reference.getInverseVal("xi"));
                } else {
                    converted.append(reference.getInverseVal(temp));
                }
                System.out.println("consonant");

                break;

            default:
                System.out.println("others");
                converted.append(temp);
                break;
            }
            //System.out.println("I reached this step");
            tobeParsed.delete(0, nextIndex);
            //System.out.println(tobeParsed.toString());
            //System.out.println("current length: " + tobeParsed.length());

        }
        converted.append("\n");
        return converted.toString();
    }
    
    static biTable getkatakanaToModKunreiTable() {
        return katakanaToModKunreiTable.katakanaToModKunrei;
    }

    private int vowelChainCheck(StringBuilder tobeParsed, StringBuilder converted, String vowel) {
        int nextIndex = 1;
        while (tobeParsed.length() > nextIndex && String.valueOf(tobeParsed.charAt(nextIndex)).equals(vowel)) {
            //System.out.println("loop char: " + tobeParsed.charAt(nextIndex));
            converted.append(reference.getInverseVal("onbiki"));
            nextIndex++;
            //System.out.println("loop #: " + nextIndex);
        }
        return nextIndex;
    }

    private int theYCondition(StringBuilder tobeParsed, StringBuilder converted, int nextIndex, String temp, String vorc) {
        if (tobeParsed.length() > nextIndex && tobeParsed.charAt(nextIndex) == 'y') {
            String nextChar = String.valueOf(tobeParsed.charAt(nextIndex));
            if (tobeParsed.length() > nextIndex + 1
                && String.valueOf(tobeParsed.charAt(nextIndex + 1)).matches(VOWEL)) {
                System.out.println("But here instead");
                String combo = nextChar + String.valueOf(tobeParsed.charAt(nextIndex + 1));
                if (vorc.equals("v")) {
                    converted.append(reference.getInverseVal(combo));

                } else {
                    converted.append(reference.getInverseVal(temp));
                    converted.append(reference.getInverseVal("x" + combo));
                }
                nextIndex+=2;
            } else {
                System.out.println("here");
                converted.append(reference.getInverseVal("xi"));
                nextIndex++;
            }
            tobeParsed.delete(0, nextIndex);
            nextIndex++;
        }
        return nextIndex;

    }
}
