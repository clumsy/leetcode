package leetcode;

@BeatsPercent(73.51)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem1529 {
    public int minFlips(String target) {
        char ch = '1';
        int count = 0;
        for (int i = 0, length = target.length(); i < length; i++) {
            if (target.charAt(i) == ch) {
                count++;
                ch = ch == '1' ? '0' : '1';
            }
        }
        return count;
    }   
}
