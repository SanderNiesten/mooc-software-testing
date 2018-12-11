package tudelft.roman;
import java.util.*;

public class RomanNumeralVersionTwo {
    private static HashMap<Character, Integer> hmap;

    static {
        hmap = new HashMap<Character, Integer>();

        hmap.put('I', 1);
        hmap.put('V', 5);
        hmap.put('X', 10);
        hmap.put('L', 50);
        hmap.put('C', 100);
        hmap.put('D', 500);
        hmap.put('M', 1000);
    }

    public static void convert(String s) {
        int convertedNumber = 0;

        for (int i = 0; i < s.length(); i++) {
            int thisNumber = hmap.get(s.charAt(i));
            int nextNumber = i+1 < s.length() ? hmap.get(s.charAt(i+1)) : 0;

            if (thisNumber < nextNumber) {
                convertedNumber -= thisNumber;
            } else {
                convertedNumber += thisNumber;
            }



        }
            System.out.println(convertedNumber);
    }

    public static void main (String[] args) {

        convert("XXXIX");
        convert("CCXLVI");
        convert("CDXXI");
        convert("CLX");
        convert("CCVII");
        convert("MLXVI");
        convert("MDCCLXXVI");
        convert("MCMLIV");
        convert("MCMXC");
        convert("MMXIV");


    }
}