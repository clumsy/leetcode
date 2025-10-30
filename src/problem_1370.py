class Solution:
    def sortString(self, s: str) -> str:
        cnt = Counter(s)
        res = []
        while len(res) < len(s):
            for c in string.ascii_lowercase:
                if cnt[c] > 0:
                    res.append(c)
                    cnt[c] -= 1
            for c in string.ascii_lowercase[::-1]:
                if cnt[c] > 0:
                    res.append(c)
                    cnt[c] -= 1
        res = "".join(res)
        return res
