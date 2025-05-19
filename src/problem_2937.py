class Solution:
    def findMinimumOperations(self, s1: str, s2: str, s3: str) -> int:
        n1, n2, n3 = (len(s) for s in (s1, s2, s3))
        if s1[0] == s2[0] == s3[0]:
            res = 0
            for i in range(max(n1, n2, n3)):
                if i >= min(n1, n2, n3) or not (s1[i] == s2[i] == s3[i]):
                    res = n1 - i + n2 - i + n3 - i
                    break
        else:
            res = -1
        return res
