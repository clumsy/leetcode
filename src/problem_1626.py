class Solution:
    def bestTeamScore(self, scores: List[int], ages: List[int]) -> int:
        n = len(scores)
        order = range(n)
        order = sorted(order, key=lambda x: (ages[x], scores[x]))
        dp = [0] * n  # dp[i] = max sum in [0:i] if ith is taken
        for e in range(n):
            dp[e] = scores[order[e]]  # e-th is taken
            for s in range(e):
                if scores[order[e]] >= scores[order[s]]:  # can take s-th
                    dp[e] = max(dp[e], dp[s] + scores[order[e]])
        return max(dp)
