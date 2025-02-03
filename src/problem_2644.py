class Solution:
    def maxDivScore(self, nums: List[int], divisors: List[int]) -> int:
        res, cnt = inf, 0
        for j in divisors:
            cur = 0
            for i in nums:
                cur += i % j == 0
            if cur >= cnt:
                res = res if cur == cnt and res < j else j
                cnt = cur
        return res
