class Solution:
    def sortByReflection(self, nums: List[int]) -> List[int]:
        nums.sort(key=lambda x: (int(bin(x)[2:][::-1]), x))
        res = nums
        return res
