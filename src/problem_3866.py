class Solution:
    def firstUniqueEven(self, nums: list[int]) -> int:
        res, cnt = -1, Counter(nums)
        for i in nums:
            if i & 1 == 0 and cnt[i] == 1:
                res = i
                break
        return res
