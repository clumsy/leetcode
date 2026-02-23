class Solution:
    def maximumXor(self, s: str, t: str) -> str:
        o = t.count("1")
        z = len(t) - o
        s = list(s)
        for i in range(len(s)):
            if s[i] == "1":
                if z > 0:
                    z -= 1
                else:
                    s[i] = "0"
                    o -= 1
            else:
                if o > 0:
                    s[i] = "1"
                    o -= 1
                else:
                    z -= 1
        res = "".join(s)
        return res
