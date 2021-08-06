package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.CONSTANT)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem1551 {
    public int minOperations(int n) {
        /*
        int ans = 0;
        for (int i = 0, j = 1; i < n; i++, j += 2) {
            if (2*i + 1 >= n) {
                break;
            }
            ans += n - j;
        }
        return ans;
        */
        
        /*
        int first = n - 1;
        int count = n/2;
        int last = 1;
        return (first + last)*count/2;
        */

        return n*n/4;
    }
}
