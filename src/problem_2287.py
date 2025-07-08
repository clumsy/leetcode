class Solution:
    def rearrangeCharacters(self, s: str, target: str) -> int:
        res, cnt_s, cnt_t = len(s), Counter(s), Counter(target)
        for c in cnt_t:
            res = min(res, cnt_s[c] // cnt_t[c])
        return res
