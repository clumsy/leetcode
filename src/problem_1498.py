class Solution:
    def numSubseq(self, nums: List[int], target: int) -> int:
        MOD = 10**9 + 7
        nums, n = sorted(nums), len(nums)
        lo, hi = 0, n - 1
        res, p = 0, 2 ** (hi - lo)
        while lo <= hi:
            if nums[lo] + nums[hi] > target:
                hi -= 1
            else:
                res += p % MOD
                lo += 1
            p //= 2
        return res % MOD
