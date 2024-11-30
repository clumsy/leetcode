class Solution:
    def minArraySum(self, nums: List[int], k: int, op1: int, op2: int) -> int:
        n = len(nums)
        dp = [[[inf if i else 0] * (op2 + 1) for _ in range(op1 + 1)] for i in range(n + 1)]  # dp[i][op1][op2]
        for i in range(n):
            for o1 in range(op1 + 1):
                for o2 in range(op2 + 1):
                    n0 = nums[i]
                    dp[i + 1][o1][o2] = min(dp[i + 1][o1][o2], dp[i][o1][o2] + n0)
                    n1 = (n0 + 1) // 2
                    if o1:
                        dp[i + 1][o1 - 1][o2] = min(dp[i + 1][o1 - 1][o2], dp[i][o1][o2] + n1)
                    n2 = n0 - k
                    if o2 and n2 >= 0:
                        dp[i + 1][o1][o2 - 1] = min(dp[i + 1][o1][o2 - 1], dp[i][o1][o2] + n2)
                        if o1:
                            dp[i + 1][o1 - 1][o2 - 1] = min(dp[i + 1][o1 - 1][o2 - 1], dp[i][o1][o2] + min((n0 - k + 1) // 2, n1 - k if n1 - k >= 0 else inf))
        res = min(dp[-1][0])
        return res
