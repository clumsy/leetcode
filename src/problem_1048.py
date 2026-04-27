class Solution:
    def longestStrChain(self, words: List[str]) -> int:
        dp = {}
        for w in sorted(words, key=len):
            for i in range(len(w)):
                size = dp.get(w[:i] + w[i + 1 :], 0)
                dp[w] = max(dp.get(w, 0), size + 1)
        res = max(dp.values())
        return res
