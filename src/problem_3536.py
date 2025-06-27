class Solution:
    def maxProduct(self, n: int) -> int:
        d1, d2 = nlargest(2, (int(d) for d in str(n)))
        res = d1 * d2
        return res
