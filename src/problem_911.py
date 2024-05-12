import marimo

__generated_with = "0.5.1"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 911](https://leetcode.com/problems/online-election)")
    return


@app.cell
def __():
    from typing import List
    from bisect import bisect_right
    from collections import defaultdict
    return List, bisect_right, defaultdict


@app.cell
def __(List, bisect_right, defaultdict):
    class TopVotedCandidate:
        def __init__(self, persons: List[int], times: List[int]):
            self.times = times
            self.persons = persons
            self.leaders, votes, leader = [None] * len(times), defaultdict(int), 0
            for i in range(len(times)):
                votes[persons[i]] += 1
                if votes[persons[i]] >= votes[leader]:
                    leader = persons[i]
                self.leaders[i] = leader

        def q(self, t: int) -> int:
            hi = bisect_right(self.times, t)
            return self.leaders[hi - 1]
    return TopVotedCandidate,


@app.cell
def __(TopVotedCandidate):
    sol = TopVotedCandidate([0,1,1,0,0,1,0], [0,5,10,15,20,25,30])
    assert sol.q(3) == 0
    assert sol.q(12) == 1
    assert sol.q(25) == 1
    assert sol.q(15) == 0
    assert sol.q(24) == 0
    assert sol.q(8) == 1
    return sol,


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
