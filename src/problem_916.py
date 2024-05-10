import marimo

__generated_with = "0.5.1"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 916](https://leetcode.com/problems/word-subsets)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution:
        def wordSubsets(self, words1: List[str], words2: List[str]) -> List[str]:
            mask = Counter()
            for w2 in words2:
                mask |= Counter(w2)
            res = [w1 for w1 in words1 if Counter(w1) & mask == mask]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.wordSubsets(["amazon","apple","facebook","google","leetcode"], ["e","o"]) == ["facebook","google","leetcode"]
    return


@app.cell
def __(sol):
    assert sol.wordSubsets(["amazon","apple","facebook","google","leetcode"], ["l","e"]) == ["apple","google","leetcode"]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
