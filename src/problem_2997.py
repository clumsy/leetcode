class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        xr = (reduce(xor, nums) ^ k)
        res = 0
        while xr > 0:
            xr -= xr & -xr
            res += 1
        return res
