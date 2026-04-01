class Solution:
    def maxUniqueSplit(self, s: str, uniq=None) -> int:
        uniq = uniq or set()
        res = len(uniq)
        for i in range(1, len(s) + 1):
            if (chunk := s[:i]) not in uniq:
                uniq.add(chunk)
                res = max(res, self.maxUniqueSplit(s[i:], uniq))
                uniq.remove(chunk)
        return res
