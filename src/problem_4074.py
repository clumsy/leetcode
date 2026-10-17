class Solution:
    def maxProductPair(self, nums: list[int], t: int) -> list[int]:
        cnt, m, res = {}, -inf, [-1, -1]
        for i, e in enumerate(nums):
            if e != t - e and t - e in cnt:
                cur = e * nums[cnt[t - e]]
                if cur > m:
                    res = sorted((i, cnt[t - e]), key=nums.__getitem__, reverse=True)
                    m = cur
            cnt[e] = i
        return res
