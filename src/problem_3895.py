class Solution:
    def countDigitOccurrences(self, nums: list[int], d: int) -> int:
        res = 0
        for i in nums:
            while i:
                i, r = divmod(i, 10)
                res += r == d
        return res
