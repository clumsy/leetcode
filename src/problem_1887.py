class Solution:
    def reductionOperations(self, nums: List[int]) -> int:
        nums.sort()
        count = 0
        size = len(nums)
        prev = i = size - 1
        while i >= 0:
            if nums[i] != nums[prev]:
                count += size - i - 1
                prev = i
            i -= 1
        return count
