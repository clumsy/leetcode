class Solution:
    def countSpecialIntegers(self, nums: list[int]) -> int:
        cnt = {}
        for i, e in enumerate(nums):
            if i and e == nums[i - 1]:
                continue
            cnt[e] = i if e not in cnt else -1
        res = sum(v >= 0 for v in cnt.values())
        return res
