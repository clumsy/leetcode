import marimo

__generated_with = "0.6.19"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 318](https://leetcode.com/problems/maximum-product-of-word-lengths)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution:
        def maxProduct(self, words: List[str]) -> int:
            n = len(words)
            for i in range(n):
                words[i] = Counter(words[i])
            res = 0
            for i in range(n - 1):
                for j in range(i + 1, n):
                    if len(words[i] & words[j]) == 0:
                        res = max(res, words[i].total() * words[j].total())
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maxProduct(["abcw","baz","foo","bar","xtfn","abcdef"]) == 16
    return


@app.cell
def __(sol):
    assert sol.maxProduct(["a","ab","abc","d","cd","bcd","abcd"]) == 4
    return


@app.cell
def __(sol):
    assert sol.maxProduct(["a","aa","aaa","aaaa"]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
