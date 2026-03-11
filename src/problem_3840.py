class Solution:
    def rob(self, nums: List[int], colors: List[int]) -> int:
        skip = take = c_ = 0
        for k, c in zip(nums, colors):
            skip, take, c_ = max(skip, take), max(take if c_ != c else 0, skip) + k, c
        res = max(skip, take)
        return res
