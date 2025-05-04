class Solution:
    def missingInteger(self, nums: List[int]) -> int:
        n = len(nums)
        cur = res = 0
        for i in range(n):
            if i > 0 and nums[i] - nums[i - 1] != 1:
                break
            cur += nums[i]
            res = max(res, cur)
        nums.sort()
        for i in range(n):
            if nums[i] == res:
                res += 1
        return res
