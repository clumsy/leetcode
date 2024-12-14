class Solution:
    def findTheArrayConcVal(self, nums: List[int]) -> int:
        n = len(nums)
        lo, hi = 0, n - 1
        res = 0 if n & 1 == 0 else nums[n // 2]
        while lo < hi:
            res += int(str(nums[lo]) + str(nums[hi]))
            lo += 1
            hi -= 1
        return res
