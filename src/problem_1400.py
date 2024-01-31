import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem](https://leetcode.com/problems/construct-k-palindrome-strings/description)")
    return


@app.cell
def __():
    from collections import Counter
    return Counter,


@app.cell
def __(Counter):
    class Solution:
        def canConstruct(self, s: str, k: int) -> bool:
            cnt = [0, 0]
            for v in Counter(s).values():
                cnt[v & 1] += 1
            evn, odd = cnt
            res = len(s) >= k and odd <= k
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.canConstruct("annabelle", 2)
    return


@app.cell
def __(sol):
    assert not sol.canConstruct("leetcode", 3)
    return


@app.cell
def __(sol):
    assert sol.canConstruct("true", 4)
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
