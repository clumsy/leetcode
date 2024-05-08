import marimo

__generated_with = "0.4.10"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 914](https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    from functools import reduce
    return Counter, List, reduce


@app.cell
def __(Counter, List, reduce):
    class Solution:
        def hasGroupsSizeX(self, deck: List[int]) -> bool:
            cnt = Counter(deck)
            def gcd(a, b):
                return a if b == 0 else gcd(b, a % b)
            res = reduce(gcd, cnt.values()) > 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.hasGroupsSizeX([1,2,3,4,4,3,2,1])
    return


@app.cell
def __(sol):
    assert not sol.hasGroupsSizeX([1,1,1,2,2,2,3,3])
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
