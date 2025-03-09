class Solution:
    def search(self, nums: List[int], target: int) -> bool:
        lo, hi = 0, len(nums) - 1
        while lo < hi:
            mi = (lo + hi) // 2
            if target == nums[mi]:
                return True
            if nums[lo] == nums[mi]:
                lo += 1
            elif nums[lo] <= target < nums[mi] or (nums[mi] <= nums[hi] and (target < nums[mi] or target > nums[hi])):
                hi = mi - 1
            else:
                lo = mi + 1
        return nums[lo] == target
