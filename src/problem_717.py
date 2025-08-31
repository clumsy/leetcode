class Solution:
    def isOneBitCharacter(self, bits: List[int]) -> bool:
        ones, i = 0, len(bits) - 2
        while i >= 0 and bits[i] == 1:
            i -= 1
            ones += 1
        res = ones & 1 == 0
        return res
