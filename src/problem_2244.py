class Solution:
    def minimumRounds(self, tasks: List[int]) -> int:
        res, cnt = 0, Counter(tasks)
        for v in cnt.values():
            if v == 1:
                res = -1
                break
            d, r = divmod(v, 3)
            # r == 1 => -1 triplet, +2 doubles
            # r == 2 => +1 double
            d += 1 if r > 0 else 0
            res += d
        return res
