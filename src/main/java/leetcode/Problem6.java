package leetcode;

public class Problem6 {
    public String convert(String s, int numRows) {
        int length = s.length();
        int shift = Math.max(numRows + numRows - 2, 1);
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < numRows; row++) {
            for (int k = 0; k < length; k += shift) {
                if (row + k < length) {
                    result.append(s.charAt(row + k));
                    if (row != 0 && row != numRows - 1 && k + shift - row < length) {
                        result.append(s.charAt(k + shift - row));
                    }
                }
            }
        }
        return result.toString();
    }
}
