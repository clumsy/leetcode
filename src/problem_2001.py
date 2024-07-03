import marimo

__generated_with = "0.6.26"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 2001](https://leetcode.com/problems/number-of-pairs-of-interchangeable-rectangles)")
    return


@app.cell
def __():
    from typing import List
    from collections import defaultdict
    import math
    return List, defaultdict, math


@app.cell
def __(List, defaultdict, math):
    class Solution:
        def interchangeableRectangles(self, rectangles: List[List[int]]) -> int:
            ratios = defaultdict(int)
            for w, h in rectangles:
                ratios[w / h] += 1
            answer = 0
            for count in ratios.values():
                if count > 1:
                    answer += math.factorial(count) // (2*math.factorial(count - 2))
            return answer
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    example_1 = [[4,8],[3,6],[10,20],[15,30]]
    assert sol.interchangeableRectangles(example_1) == 6
    return example_1,


@app.cell
def __(sol):
    example_2 = [[4,5],[7,8]]
    assert sol.interchangeableRectangles(example_2) == 0
    return example_2,


@app.cell
def __(sol):
    example_3 = [[16,1],[13,7],[20,18],[21,15],[20,3],[18,12],[23,14],[16,14],[5,25],[3,8],[6,17],[22,10],[25,17],[8,13],[8,11],[4,14],[2,17],[9,22],[3,15],[18,1],[19,13],[26,6],[26,14],[9,10],[12,6],[24,3],[21,8],[17,6],[16,7],[8,9],[20,24],[25,26],[22,23],[4,25],[23,23],[24,8],[14,4],[10,18],[13,6],[7,6],[24,15],[16,22],[17,19],[2,16],[23,21],[15,26],[7,17],[14,7],[10,26],[9,8],[7,10],[1,1],[11,17],[4,20],[19,24],[18,24],[9,21],[20,22],[21,12],[10,23],[5,9],[2,3],[6,17],[5,20],[11,15],[7,19],[5,9],[12,13],[15,19],[3,26],[19,25],[13,6],[22,13],[18,7],[4,9],[13,24],[22,21],[21,9],[25,26],[21,20],[9,13],[10,5],[11,18],[6,20],[16,8]]
    assert sol.interchangeableRectangles(example_3) == 18
    return example_3,


@app.cell
def __(sol):
    example_4 = [[11,8],[20,6],[9,16],[8,10],[4,10],[7,17],[5,20],[11,9],[16,19],[9,9],[5,13],[3,18],[13,1],[2,12],[14,18],[9,13],[8,19],[7,16],[6,4],[16,16],[5,7],[13,10],[16,8],[9,17],[11,17],[2,17],[14,11],[8,3],[3,19],[10,20],[11,4],[11,20],[1,3],[9,1],[18,5],[20,17],[8,9],[2,19],[17,4],[3,3],[4,11],[5,19],[12,8],[4,12],[18,5],[2,12],[12,20],[19,10],[17,11],[11,6],[4,11],[1,1],[19,15],[20,17],[2,20],[12,5],[7,14],[6,8],[5,5],[16,10],[4,9],[9,8]]
    assert sol.interchangeableRectangles(example_4) == 19
    return example_4,


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
