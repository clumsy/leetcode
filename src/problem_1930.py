import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1930](https://leetcode.com/problems/unique-length-3-palindromic-subsequences)")
    return


@app.cell
def __():
    from collections import Counter
    return Counter,


@app.cell
def __(Counter):
    class Solution2:
        def countPalindromicSubsequence(self, s: str) -> int:
            res = set()
            lft, rgt = Counter(s[:1]), Counter(s[1:])
            for c in s[1:]:
                rgt[c] -= 1
                for a in lft:
                    if rgt[a] > 0:
                        cur = a + c + a
                        res.add(cur)
                lft[c] += 1
            res = len(res)
            return res
    return Solution2,


@app.cell
def __():
    import string
    return string,


@app.cell
def __(string):
    class Solution:
        def countPalindromicSubsequence(self, s: str) -> int:
            res = 0
            for c in string.ascii_lowercase:
                lo, hi = s.find(c), s.rfind(c)
                if lo >= 0:
                    res += len(set(s[lo + 1: hi]))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countPalindromicSubsequence("aabca") == 3
    return


@app.cell
def __(sol):
    assert sol.countPalindromicSubsequence("abc") == 0
    return


@app.cell
def __(sol):
    assert sol.countPalindromicSubsequence("bbcbaba") == 4
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
