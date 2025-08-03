class Solution:
    def numberOfPoints(self, nums: List[List[int]]) -> int:
        cnt = [0] * 102
        for s, e in nums:
            cnt[s] += 1
            cnt[e + 1] -= 1
        res = cur = 0
        for i in range(1, 101):
            cur += cnt[i]
            res += cur > 0
        return res
