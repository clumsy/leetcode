import marimo

__generated_with = "0.4.0"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3042](https://leetcode.com/problems/count-prefix-and-suffix-pairs-i)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def countPrefixSuffixPairs(self, words: List[str]) -> int:
            res, n = 0, len(words)
            for i in range(n - 1):
                for j in range(i + 1, n):
                    if words[j].startswith(words[i]) and words[j].endswith(words[i]):
                        res += 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countPrefixSuffixPairs(["a","aba","ababa","aa"]) == 4
    return


@app.cell
def __(sol):
    assert sol.countPrefixSuffixPairs(["pa","papa","ma","mama"]) == 2
    return


@app.cell
def __(sol):
    assert sol.countPrefixSuffixPairs(["abab","ab"]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
