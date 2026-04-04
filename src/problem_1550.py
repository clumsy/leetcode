class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        res, cur = False, 0
        for i in arr:
            if i & 1 == 0:
                cur = 0
                continue
            cur += 1
            if cur == 3:
                res = True
                break
        return res
