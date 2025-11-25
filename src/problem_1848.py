class Solution:
    def getMinDistance(self, nums: List[int], target: int, start: int) -> int:
        n, res = len(nums), 0
        while start - res >= 0 or start + res < n:
            if start - res >= 0 and nums[start - res] == target:
                break
            if start + res < n and nums[start + res] == target:
                break
            res += 1
        return res
