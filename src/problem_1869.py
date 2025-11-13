class Solution:
    def checkZeroOnes(self, s: str) -> bool:
        ones = zeros = 0
        cur_ones = cur_zeros = 0
        for c in s:
            if c == "1":
                cur_zeros = 0
                cur_ones += 1
            else:
                cur_ones = 0
                cur_zeros += 1
            zeros, ones = max(zeros, cur_zeros), max(ones, cur_ones)
        res = ones - zeros > 0
        return res
