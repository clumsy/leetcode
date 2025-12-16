class Solution:
    def countLargestGroup(self, n: int) -> int:
        res, ma, cnt = 0, 0, Counter()
        for num in range(1, n + 1):
            s = sum(int(d) for d in str(num))
            cnt[s] = cnt.get(s, 0) + 1
            if cnt[s] > ma:
                res, ma = 1, cnt[s]
            elif cnt[s] == ma:
                res += 1
        return res
