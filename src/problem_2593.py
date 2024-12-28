class Solution:
    def findScore(self, nums: List[int]) -> int:
        order = sorted((e, i) for i, e in enumerate(nums))
        res, n = 0, len(nums)
        for e, i in order:
            if nums[i] is not None:
                res += e
                nums[i] = None
                if i > 0:
                    nums[i - 1] = None
                if i < n - 1:
                    nums[i + 1] = None
        return res
