class Solution:
    def maxSum(self, nums: List[int]) -> int:
        digs, res = {}, -1
        for i in nums:
            d = max(int(d) for d in str(i))
            dig = digs.get(d, None)
            if dig is not None:
                res = max(res, i + dig)
            digs[d] = max(dig or i, i)
        return res
