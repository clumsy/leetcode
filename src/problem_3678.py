class Solution:
    def smallestAbsent(self, nums: List[int]) -> int:
        a, s = int(sum(nums) / len(nums) + 1), set(nums)
        res = next(i for i in range(max(a, 1), max(0, max(nums)) + 2) if i not in s)
        return res
