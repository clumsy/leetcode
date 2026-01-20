class Solution:
    def isPossibleDivide(self, nums: List[int], k: int) -> bool:
        res, cnt = True, Counter(nums)
        for v in sorted(cnt.keys()):
            if not res:
                break
            if not cnt[v]:
                continue
            for i in range(k)[::-1]:
                if cnt[v + i]:
                    cnt[v + i] -= cnt[v]
                else:
                    res = False
                    break
        return res
