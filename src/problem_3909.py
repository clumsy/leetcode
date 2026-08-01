class Solution:
    def compareBitonicSums(self, nums: list[int]) -> int:
        asc = dsc = 0
        for i in range(1, len(nums)):
            if nums[i - 1] < nums[i]:
                asc += nums[i - 1]
            elif nums[i - 1] > nums[i]:
                dsc += nums[i]
        res = 0 if asc > dsc else 1 if dsc > asc else -1
        return res
