class Solution:
    def minOperations(self, s: str) -> int:
        ones, zeros = [0, 0], [0, 0]
        for i, c in enumerate(s):
            ones[i & 1] += c == "1"
            zeros[i & 1] += c == "0"
        res = min(zeros[0] + ones[1], zeros[1] + ones[0])
        return res
