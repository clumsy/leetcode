class Solution:
    def isPrefixString(self, s: str, words: List[str]) -> bool:
        pos, n = 0, len(s)
        for w in words:
            if s.startswith(w, pos):
                pos += len(w)
                if pos >= n:
                    break
            else:
                pos = -1
                break
        res = pos == n
        return res
