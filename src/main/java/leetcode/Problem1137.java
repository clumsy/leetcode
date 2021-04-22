package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.LOGARITHMIC_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem1137 {
    private void multiply(int[][] current, int[][] other) {
        int n = current.length;
        assert n == current[0].length;
        int[][] temp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int product = 0;
                for (int k = 0; k < n; k++) {
                    product += current[i][k]*other[k][j];
                }
                temp[i][j] = product;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                current[i][j] = temp[i][j];
            }
        }
    }
    
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        int[][] M = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        int[][] A = {
            {1, 1, 1},
            {1, 0, 0},
            {0, 1, 0}
        };
        n -= 2; // A^(n-2) * {F2, F1, F0}
        while (n > 0) {
            if ((n&1) != 0) {
                multiply(M, A);
            }
            multiply(A, A);
            n /= 2;
        }
        return M[0][0] + M[0][1]; // * {1, 1, 0}
    }

    // O(N) below
//    public int tribonacci(int n) {
//        int t0 = 0;
//        if (n == 0) {
//            return t0;
//        }
//        int t1 = 1;
//        if (n == 1) {
//            return t1;
//        }
//        int t2 = 1;
//        n -= 2;
//        while (n-- > 0) {
//            int next = t0 + t1 + t2;
//            t0 = t1;
//            t1 = t2;
//            t2 = next;
//        }
//        return t2;
//    }
}
