class Solution:
    def countSymmetricIntegers(self, low: int, high: int) -> int:
        res = 0
        for i in range(low, high + 1):
            s = str(i)
            if len(s) & 1 == 0 and 2 * sum(int(d) for d in s[:len(s)//2]) == sum(int(d) for d in s):
                res += 1
        return res
