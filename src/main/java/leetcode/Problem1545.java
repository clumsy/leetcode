package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.LINEAR_N) // the recursion calls n-1
@SpaceComplexity(Complexity.LINEAR_N) // because of recursion
public class Problem1545 {
    public char findKthBit(int n, int k) {
        // Sn is always of odd length
        // middle element is always 1
        // first is always 0, last is always 1
        if (k == 1) {
            return '0';
        }
        int last = ((int) Math.pow(2, n)) - 1;
        if (k == last) {
            return '1';
        }
        int middle = (last + 1)/2;
        if (k == middle) {
            return '1';
        }
        if (k < middle) {
            return findKthBit(n - 1, k);
        }
        char inverted = findKthBit(n - 1, last - k + 1);
        return inverted == '0' ? '1' : '0';
    }
}
