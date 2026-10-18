class Solution:
    def smallestIndex(self, nums: List[int]) -> int:
        def fun(x):
            res = 0
            while x:
                x, r = divmod(x, 10)
                res += r
            return res

        res = next((i for i, e in enumerate(nums) if fun(e) == i), -1)
        return res
