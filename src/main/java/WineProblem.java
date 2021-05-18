public class WineProblem {
    public static class Solution1 {
        public static int getMaxMoney(int[] price) {
            int N = price.length;
            int[][] dp = new int[N][N];
            for (int i = 0; i < N; i++) {
                dp[i][i] = price[i]*N;
            }
            for (int left = N - 2; left >= 0; left--) {
                for (int right = left + 1; right < N; right++) {
                    int year = N - right + left;
                    dp[left][right] =
                        Math.max(price[left ]*year + dp[left + 1][right    ],
                                 price[right]*year + dp[left    ][right - 1]);
                }
            }
            return dp[0][N - 1];
        }
    }

    public static class Solution2 {
        public static int getMaxMoney(int[] price) {
            int N = price.length;
            int[][] dp = new int[N][N];
            for (int left = 0; left < N; left++) {
                for (int right = N - 1; right >= 0; right--) {
                    int year = N - right + left;
                    if (right > 0) {
                        dp[left][right - 1] = Math.max(dp[left][right] * price[right] * year, dp[left    ][right - 1]);
                    }
                    if (left < N - 1) {
                        dp[left + 1][right] = Math.max(dp[left][right] * price[left ] * year, dp[left + 1][right    ]);
                    }
                }
            }
            int max = 0;
            for (int i = 0; i < N; i++) {
                max = Math.max(max, dp[i][i] + price[i]*N);
            }
            return max;
        }
    }
}
