class Solution:
    def digitFrequencyScore(self, n: int) -> int:
        res = sum(d * f for d, f in Counter(int(i) for i in str(n)).items())
        return res
