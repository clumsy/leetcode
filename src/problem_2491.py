import marimo

__generated_with = "0.3.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2491](https://leetcode.com/problems/divide-players-into-teams-of-equal-skill)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution:
        def dividePlayers(self, skill: List[int]) -> int:
            s = sum(skill) * 2 // len(skill)
            res, cnt = 0, Counter(skill)
            for i in cnt:
                if cnt[i] != cnt[s - i]:  # has to have the same count for both numbers
                    res = -1
                    break
                res += cnt[i] * i * (s - i)
            res = res if res < 0 else res // 2  # we counted the same chemistry twice (for time for each number in pair)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.dividePlayers([3,2,5,1,3,4]) == 22
    return


@app.cell
def __(sol):
    assert sol.dividePlayers([3,4]) == 12
    return


@app.cell
def __(sol):
    assert sol.dividePlayers([1,1,2,3]) == -1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
