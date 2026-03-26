class Solution:
    def numSplits(self, s: str) -> int:
        res, l_cnt, r_cnt = 0, Counter(), Counter(s)
        for c in s:
            l_cnt[c] += 1
            r_cnt[c] -= 1
            if r_cnt[c] == 0:
                del r_cnt[c]
            res += len(l_cnt) == len(r_cnt)
        return res
