import marimo

__generated_with = "0.7.5"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2085](https://leetcode.com/problems/count-common-words-with-one-occurrence)")
    return


@app.cell
def __():
    from typing import List
    from collections import defaultdict
    return List, defaultdict


@app.cell
def __(List, defaultdict):
    class Solution:
        def countWords(self, words1: List[str], words2: List[str]) -> int:
            c = defaultdict(int)
            for w in words1:
                c[w] += 1
            for w in words2:
                k = c[w]
                if k < 2:
                    c[w] = k - 1
            res = sum(c[w] == 0 for w in c)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countWords(["leetcode","is","amazing","as","is"], ["amazing","leetcode","is"]) == 2
    return


@app.cell
def __(sol):
    assert sol.countWords(["b","bb","bbb"], ["a","aa","aaa"]) == 0
    return


@app.cell
def __(sol):
    assert sol.countWords(["a","ab"], ["a","a","a","ab"]) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

