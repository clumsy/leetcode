class Solution:
    def minimumSwaps(self, nums: list[int]) -> int:
        res, lo, hi = 0, 0, len(nums) - 1
        while lo < hi:
            if nums[lo] != 0:
                lo += 1
                continue
            if nums[hi] == 0:
                hi -= 1
                continue
            res += 1
            lo += 1
            hi -= 1
        return res
