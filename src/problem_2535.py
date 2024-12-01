class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        res = abs(sum(nums) - sum(sum(int(d) for d in str(i)) for i in nums))
        return res
