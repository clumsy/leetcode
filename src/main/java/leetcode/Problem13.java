package leetcode;

public class Problem13 {
    private static String[] ROMANS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static int[] FACTORS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public int romanToInt(String s) {
        int number = 0;
        int position = 0;
        for (int i = 0; i < ROMANS.length; i++) {
            String current = ROMANS[i];
            while (startsWith(s, position, current)) {
                number += FACTORS[i];
                int currentLength = current.length();
                position += currentLength;
                if (currentLength > 1) {
                    break;
                }
            }
        }
        return number;
    }

    private static boolean startsWith(String s, int offset, String prefix) {
        if (s.length() - offset < prefix.length()) {
            return false;
        }
        for (int i = 0; i < prefix.length(); i++) {
            if (s.charAt(i + offset) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
