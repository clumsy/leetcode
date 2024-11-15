import marimo

__generated_with = "0.9.19"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2347](https://leetcode.com/problems/best-poker-hand)""")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution:
        def bestHand(self, ranks: List[int], suits: List[str]) -> str:
            if len(Counter(suits)) == 1:
                res = "Flush"
            else:
                _, cnt = Counter(ranks).most_common(1)[0]
                res = "Three of a Kind" if cnt >= 3 else "Pair" if cnt == 2 else "High Card"
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.bestHand([13,2,3,1,9], ["a","a","a","a","a"]) == "Flush"
    return


@app.cell
def __(sol):
    assert sol.bestHand([4,4,2,4,4], ["d","a","a","b","c"]) == "Three of a Kind"
    return


@app.cell
def __(sol):
    assert sol.bestHand([10,10,2,12,9], ["a","b","c","a","d"]) == "Pair"
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
