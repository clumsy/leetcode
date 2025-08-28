class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        left, right = 0, sum(nums)
        res = -1
        for i, e in enumerate(nums):
            right -= e
            if left == right:
                res = i
                break
            left += e
        return res
