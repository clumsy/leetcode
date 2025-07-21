class Solution:
    def findNonMinOrMax(self, nums: List[int]) -> int:
        mi = ma = res = nums[0]
        for i in nums:
            if i < mi:
                mi, res = i, mi
            elif i > ma:
                ma, res = i, ma
            elif mi < i < ma:
                res = i
                break
        res = res if mi < res < ma else -1
        return res
