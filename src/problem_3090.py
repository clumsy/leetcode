import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3090](https://leetcode.com/problems/maximum-length-substring-with-two-occurrences)")
    return


@app.cell
def __():
    from collections import Counter
    return Counter,


@app.cell
def __(Counter):
    class Solution:
        def maximumLengthSubstring(self, s: str) -> int:
            cnt, res, ttl = Counter(), 0, 0
            for i, c in enumerate(s):
                while cnt[c] > 1:
                    cnt[s[i - ttl]] -= 1
                    ttl -= 1
                cnt[c] += 1
                ttl += 1
                res = max(res, ttl)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maximumLengthSubstring("bcbbbcba") == 4
    return


@app.cell
def __(sol):
    assert sol.maximumLengthSubstring("aaaa") == 2
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
