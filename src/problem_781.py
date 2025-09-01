class Solution:
    def numRabbits(self, answers: List[int]) -> int:
        res, cnt = 0, Counter(answers)
        for k, v in cnt.items():
            d, r = divmod(v, k + 1)
            res += (d + (r > 0)) * (k + 1)
        return res
