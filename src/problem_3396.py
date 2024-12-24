class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        s = set()
        res = 0
        for i in reversed(range(len(nums))):
            if nums[i] in s:
                res = (i + 1 + 2) // 3
                break
            s.add(nums[i])
        return res
