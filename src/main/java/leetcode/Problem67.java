package leetcode;

@BeatsPercent(100)
public class Problem67 {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder(Math.max(a.length(), b.length()));
        int positionA = a.length() - 1;
        int positionB = b.length() - 1;
        int carry = 0;
        while (positionA >= 0 || positionB >= 0 || carry > 0) {
            int currentA = 0;
            if (positionA >= 0) {
                currentA = a.charAt(positionA--) - '0';
            }
            int currentB = 0;
            if (positionB >= 0) {
                currentB = b.charAt(positionB--) - '0';
            }
            int sum = carry + currentA + currentB;
            result.append((char) ('0' + (sum%2)));
            carry = sum/2;
        }
        return result.reverse().toString();
    }
}
