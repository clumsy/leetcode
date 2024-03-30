import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2451](https://leetcode.com/problems/odd-string-difference/description)")
    return


@app.cell
def __():
    from typing import List
    from collections import defaultdict
    return List, defaultdict


@app.cell
def __(List, defaultdict):
    class Solution:
        def oddString(self, words: List[str]) -> str:
            diffs = defaultdict(list)
            def difference(w):
                return ",".join(str(ord(w[i + 1]) - ord(w[i])) for i in range(len(w) - 1))
            for w in words:
                diffs[difference(w)].append(w)
            for v in diffs.values():
                if len(v) == 1:
                    res = v[0]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.oddString(["adc","wzy","abc"]) == "abc"
    return


@app.cell
def __(sol):
    assert sol.oddString(["aaa","bob","ccc","ddd"]) == "bob"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
