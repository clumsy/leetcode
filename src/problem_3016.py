import marimo

__generated_with = "0.5.1"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3016](https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii)")
    return


@app.cell
def __():
    from collections import Counter
    return Counter,


@app.cell
def __(Counter):
    class Solution:
        def minimumPushes(self, word: str) -> int:
            p, cnt = 1, Counter(word)
            res = k = 0
            for v in sorted(cnt.values(), reverse=True):
                k += 1
                if k == 9:
                    p += 1
                    k = 1
                res += p * v
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumPushes("abcde") == 5
    return


@app.cell
def __(sol):
    assert sol.minimumPushes("xyzxyzxyzxyz") == 12
    return


@app.cell
def __(sol):
    assert sol.minimumPushes("aabbccddeeffgghhiiiiii") == 24
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
