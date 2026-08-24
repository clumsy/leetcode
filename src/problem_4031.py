class Solution:
    def findDisappearedNumbers(
        self, nums: list[int], l: int, u: int
    ) -> list[list[int]]:
        nums = [l - 1] + sorted(x for x in set(nums) if l <= x <= u) + [u + 1]
        res = [[a + 1, b - 1] for a, b in zip(nums, nums[1:]) if b > a + 1]
        return res
