import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2410](https://leetcode.com/problems/maximum-matching-of-players-with-trainers)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def matchPlayersAndTrainers(self, players: List[int], trainers: List[int]) -> int:
            players.sort()
            trainers.sort()
            res = t = 0
            for p in players:
                while t < len(trainers) and p > trainers[t]:
                    t += 1
                if t == len(trainers):
                    break
                res += 1
                t += 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.matchPlayersAndTrainers([4,7,9], [8,2,5,8]) == 2
    return


@app.cell
def __(sol):
    assert sol.matchPlayersAndTrainers([1,1,1], [10]) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
