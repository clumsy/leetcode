class Solution:
    def findShortestSubArray(self, nums: List[int]) -> int:
        deg, res, cnt, mi = 1, len(nums), Counter(), {}
        for i, e in enumerate(nums):
            cnt[e] += 1
            m = mi.get(e, i)
            mi[e] = m
            if cnt[e] >= deg:
                res = min(res, i - m + 1) if cnt[e] == deg else (i - m + 1)
                deg = cnt[e]
        return res
