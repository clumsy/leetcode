class Solution:
    def isTrionic(self, nums: List[int]) -> bool:
        n = len(nums)
        p = q = 0
        for i in range(1, n):
            if nums[i] <= nums[i - 1]:
                p = i - 1
                break
        for i in range(p + 1, n):
            if nums[i] >= nums[i - 1]:
                q = i - 1
                break
        for i in range(q + 1, n):
            if nums[i] <= nums[i - 1]:
                n = i - 1
                break
        res = 0 < p < q < n and n == len(nums)
        return res
