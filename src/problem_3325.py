import marimo

__generated_with = "0.9.14"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3325](https://leetcode.com/problems/count-substrings-with-k-frequency-characters-i)""")
    return


@app.cell
def __():
    from collections import Counter
    return (Counter,)


@app.cell
def __(Counter):
    class Solution2:
        def numberOfSubstrings(self, s: str, k: int) -> int:
            cnt, n = Counter(), len(s)
            res = b = 0
            for i, c in enumerate(s):
                cnt[c] += 1
                while b <= i and cnt[c] >= k:
                    res += n - i
                    cnt[s[b]] -= 1
                    b += 1
            return res
    return (Solution2,)


@app.cell
def __(Counter):
    class Solution:
        def numberOfSubstrings(self, s: str, k: int) -> int:
            cnt, n = Counter(), len(s)
            res, b = n * (n + 1) // 2, 0
            for i, c in enumerate(s):
                cnt[c] += 1
                while b <= i and cnt[c] >= k:
                    cnt[s[b]] -= 1
                    b += 1
                res -= i - b + 1
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.numberOfSubstrings("abacb", 2) == 4
    return


@app.cell
def __(sol):
    assert sol.numberOfSubstrings("abcde", 1) == 15
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
