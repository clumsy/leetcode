class Solution:
    def minimumSum(self, nums: List[int]) -> int:
        n = len(nums)
        rgt = [nums[-1]] * n
        for i in range(n - 1)[::-1]:
            rgt[i] = min(rgt[i + 1], nums[i])
        res, lft = inf, nums[0]
        for i in range(1, n - 1):
            if nums[i] > max(lft, rgt[i + 1]):
                res = min(res, lft + nums[i] + rgt[i + 1])
            lft = min(lft, nums[i])
        res = -1 if res is inf else res
        return res
