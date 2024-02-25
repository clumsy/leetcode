import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3039](https://leetcode.com/problems/apply-operations-to-make-string-empty)")
    return


@app.cell
def __():
    from collections import Counter
    return Counter,


@app.cell
def __(Counter):
    class Solution:
        def lastNonEmptyString(self, s: str) -> str:
            cnt = Counter(s)
            ma = max(cnt.values())
            vals = {i for i, c in cnt.items() if c == ma}
            res = []
            for c in s[::-1]:
                if c in vals:
                    res.append(c)
                    vals.remove(c)
                    if not vals:
                        break
            res = "".join(res[::-1])
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.lastNonEmptyString("aabcbbca") == "ba"
    return


@app.cell
def __(sol):
    assert sol.lastNonEmptyString("abcd") == "abcd"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
