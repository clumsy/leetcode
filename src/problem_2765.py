class Solution:
    def alternatingSubarray(self, nums: List[int]) -> int:
        res = cur = 1
        for i in range(1, len(nums)):
            diff = nums[i] - nums[i - 1]
            if diff == (-1) ** (cur + 1):
                cur += 1
            else:
                cur = 1 + (diff == 1)
            res = max(res, cur)
        res = res if res > 1 else -1
        return res
