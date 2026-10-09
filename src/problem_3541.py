class Solution:
    def maxFreqSum(self, s: str) -> int:
        vwl, cnt = "aeiou", Counter(s)
        res = max((v for k, v in cnt.items() if k in vwl), default=0) + max(
            (v for k, v in cnt.items() if k not in vwl), default=0
        )
        return res
