class Solution:
    def evenNumberBitwiseORs(self, nums: List[int]) -> int:
        res = reduce(operator.ior, (i for i in nums if i & 1 == 0), 0)
        return res
