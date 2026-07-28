class Solution:
    def firstStableIndex(self, nums: list[int], k: int) -> int:
        n = len(nums)
        mins = [nums[-1]] * n
        for i in reversed(range(n - 1)):
            mins[i] = min(nums[i], mins[i + 1])
        res, ma = -1, 0
        for i in range(n):
            ma = max(ma, nums[i])
            if ma - mins[i] <= k:
                res = i
                break
        return res
