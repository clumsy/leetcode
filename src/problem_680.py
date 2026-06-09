class Solution:
    def validPalindrome(self, s: str) -> bool:
        def solve(s, rem):
            n = len(s)
            for i in range(n // 2):
                if s[i] != s[n - 1 - i]:
                    if rem == 0:
                        return False
                    return solve(s[i : n - i - 1], 0) or solve(s[i + 1 : n - i], 0)
            return True

        # solve is run at most 3 times
        res = solve(s, 1)
        return res
