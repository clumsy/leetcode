class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        lo, hi = 0, len(nums) - 1
        while lo < hi:
            while lo < hi and nums[lo] & 1 == 0:
                lo += 1
            while lo < hi and nums[hi] & 1 == 1:
                hi -= 1
            nums[lo], nums[hi] = nums[hi], nums[lo]
        res = nums
        return nums
