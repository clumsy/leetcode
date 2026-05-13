class Solution:
    def optimalDivision(self, nums: List[int]) -> str:
        n = len(nums)
        if n == 1:
            res = f"{nums[0]}"
        elif n == 2:
            res = f"{nums[0]}/{nums[1]}"
        else:
            res = f"{nums[0]}/(" + "/".join(str(i) for i in nums[1:]) + ")"
        return res
