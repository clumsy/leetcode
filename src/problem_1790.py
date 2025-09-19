class Solution:
    def areAlmostEqual(self, s1: str, s2: str) -> bool:
        misses = []
        for c1, c2 in zip(s1, s2):
            if c1 != c2:
                misses.append([c1, c2])
                if len(misses) > 2:
                    break
        res = not misses or (len(misses) == 2 and misses[0] == misses[1][::-1])
        return res
