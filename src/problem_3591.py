class Solution:
    def checkPrimeFrequency(self, nums: List[int]) -> bool:
        cnt = Counter(nums)
        res = False
        for v in cnt.values():
            if v == 1:
                continue
            for i in range(2, isqrt(v) + 1):
                if v % i == 0:
                    break
            else:
                res = True
        return res
