import marimo

__generated_with = "0.3.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3106](https://leetcode.com/problems/lexicographically-smallest-string-after-operations-with-constraint)")
    return


@app.cell
def __():
    import string
    return string,


@app.cell
def __(string):
    class Solution:
        def getSmallestString(self, s: str, k: int) -> str:
            chars, s = string.ascii_lowercase, list(s)
            for i, c in enumerate(s):
                o = ord(c) - ord("a")
                lo, hi = max(0, o - k), min(26, o + k) % 26
                if chars[lo] < chars[hi]:
                    mi = lo if chars[lo] < c else 0
                elif chars[hi] < chars[lo]:
                    mi = hi if chars[hi] < c else 0
                else:  # lo == hi
                    mi = min(lo, hi)
                if chars[mi] < c:
                    s[i] = chars[mi]
                    k -= min(abs(mi - o), abs(26 + mi - o))
                    if k == 0:
                        break
            s = "".join(s)
            return s
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.getSmallestString("zbbz", 3) == "aaaz"
    return


@app.cell
def __(sol):
    assert sol.getSmallestString("xaxcd", 4) == "aawcd"
    return


@app.cell
def __(sol):
    assert sol.getSmallestString( "lol", 0) == "lol"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
