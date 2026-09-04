class Solution:
    def largestString(self, nums: list[int]) -> list[str]:
        res = []
        for i in nums:
            cur = []
            while i:
                k = min(25, floor(log(i, 2)))
                d, i = divmod(i, 1 << k)
                cur.append(chr(ord("a") + k) * d)
            res.append("".join(cur))
        return res
