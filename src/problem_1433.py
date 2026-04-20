class Solution:
    def checkIfCanBreak(self, s1: str, s2: str) -> bool:
        c1, c2, cnt, sgn = Counter(s1), Counter(s2), 0, 0
        for ch in (chr(i) for i in range(ord("z"), ord("a") - 1, -1)):
            cnt += c2.get(ch, 0) - c1.get(ch, 0)
            if cnt * sgn < 0:
                return False
            sgn = sgn if cnt == 0 else 1 if cnt > 0 else -1
        return True
