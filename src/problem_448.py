class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        n = len(nums)
        for i in range(n):
            while nums[i] != i + 1 and nums[i] != nums[nums[i] - 1]:
                k = nums[i] - 1  # needed for swap index, otherwise won't work because of side-effects
                nums[i], nums[k] = nums[k], nums[i]
        res = []
        for i in range(n):
            if nums[i] != i + 1:
                res.append(i + 1)
        return res
