class Solution:
    def getLeastFrequentDigit(self, n: int) -> int:
        res = int(min((k, d) for d, k in Counter(str(n)).items())[1])
        return res
