class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        res = max(len(c) for c in "".join(str(i) for i in nums).split("0"))
        return res
