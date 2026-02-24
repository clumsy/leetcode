class Solution:
    def scoreDifference(self, nums: List[int]) -> int:
        res = a = 0
        for i, e in enumerate(nums):
            if e & 1 == 1:
                a ^= 1
            if (i + 1) % 6 == 0:
                a ^= 1
            res += -e if a else e
        return res
