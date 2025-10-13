class Solution:
    def findMin(self, nums: List[int]) -> int:
        lo, hi = 0, len(nums) - 1
        while lo < hi:
            if nums[lo] < nums[hi]:  # sorted
                return nums[lo]
            mi = lo + (hi - lo) // 2
            if nums[mi] > nums[hi]:  # interjection is on the right
                lo = mi + 1
            else:
                hi = mi
        return nums[lo]
