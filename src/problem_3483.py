class Solution:
    def totalNumbers(self, ds: List[int]) -> int:
        cnt, res = Counter(ds), 0
        for d1 in cnt:
            if d1 == 0:
                continue
            cnt[d1] -= 1
            for d2 in cnt:
                if cnt[d2] == 0:
                    continue
                cnt[d2] -= 1
                for d3 in (0, 2, 4, 6, 8):
                    if cnt[d3] > 0:
                        res += 1
                cnt[d2] += 1
            cnt[d1] += 1
        return res
