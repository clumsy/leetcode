package leetcode;

public class Problem43 {
    public String multiply(String num1, String num2) {
        switch (num1) {
            case "0":
                return "0";
            case "1":
                return num2;
        }
        switch (num2) {
            case "0":
                return "0";
            case "1":
                return num1;
        }
        char[] s1 = num1.toCharArray();
        char[] s2 = num2.toCharArray();
        int length1 = num1.length();
        int length2 = num2.length();
        int resultLength = length1 + length2;
        int[] result = new int[resultLength];
        for (int i = length1 - 1; i >= 0; --i) {
            for (int j = length2 - 1; j >= 0; --j) {
                result[resultLength - i - j - 2] += (s1[i] - '0')*(s2[j] - '0');
            }
        }
        for (int k = 0; k < resultLength - 1; ++k) {
            result[k + 1] += result[k]/10;
            result[k] %= 10;
        }
        int i = resultLength - 1;
        while (i >= 0 && result[i] == 0) {
            i--;
        }
        if (i < 0) {
            return "0";
        }
        StringBuilder builder = new StringBuilder();
        while (i >= 0) {
            builder.append(result[i--]);
        }
        return builder.toString();
    }
}
