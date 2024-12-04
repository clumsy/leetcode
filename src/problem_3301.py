class Solution:
    def maximumTotalSum(self, mh: List[int]) -> int:
        mh.sort(reverse=True)
        res, cur = 0, inf
        for h in mh:
            cur = min(cur - 1, h)
            if cur < 1:
                res = -1
                break
            res += cur
        return res
