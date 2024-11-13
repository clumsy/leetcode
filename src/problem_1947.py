import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1947](https://leetcode.com/problems/maximum-compatibility-score-sum)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def maxCompatibilitySum(self, students: List[List[int]], mentors: List[List[int]]) -> int:
            n = len(students[0])
            def to_binary(lst):
                res, pwr = 0, 1
                for i in reversed(range(n)):
                    res += pwr if lst[i] else 0
                    pwr <<= 1
                return res
            m = len(students)
            for i in range(m):
                students[i] = to_binary(students[i])
                mentors[i] = to_binary(mentors[i])
            def dfs(used=set(), j=0, cur=0):
                if j == m:
                    return cur
                res = 0
                for i in range(m):
                    if i not in used:
                        used.add(i)
                        res = max(res, dfs(used, j + 1, cur + (n - bin(students[j] ^ mentors[i]).count("1"))))
                        used.remove(i)
                return res
            res = dfs()
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maxCompatibilitySum([[1,1,0],[1,0,1],[0,0,1]], [[1,0,0],[0,0,1],[1,1,0]]) == 8
    return


@app.cell
def __(sol):
    assert sol.maxCompatibilitySum([[0,0],[0,0],[0,0]], [[1,1],[1,1],[1,1]]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
