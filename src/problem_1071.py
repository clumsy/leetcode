class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        if str1 + str2 != str2 + str1:
            res = ""
        else:

            def gcd(a, b):
                return a if b == 0 else gcd(b, a % b)

            res = str1[: gcd(len(str1), len(str2))]
        return res
