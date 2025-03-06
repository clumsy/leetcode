class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        res = all(v & 1 == 0 for v in Counter(nums).values())
        return res
