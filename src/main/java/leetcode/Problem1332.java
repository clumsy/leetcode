package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem1332 {
    public int removePalindromeSub(String s) {
        if (isPalindrome(s)) {
            return 1;
        }
        return 2;
    }

    private boolean isPalindrome(String s) {
        int n = s.length();
        int left = (n - 1)/2;
        int right = (n&1) == 1 ? left : left + 1;
        for (int k = 0; k <= left; k++) {
            if (s.charAt(left - k) != s.charAt(right + k)) {
                return false;
            }
        }
        return true;
    }
}
