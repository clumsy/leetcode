class Solution:
    def findClosestNumber(self, nums: List[int]) -> int:
        res = nums[0]
        for i in nums:
            diff = abs(i) - abs(res)
            if diff < 0:
                res = i
            elif diff == 0:
                res = max(i, res)
        return res
