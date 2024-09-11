import marimo

__generated_with = "0.8.19"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 1944](https://leetcode.com/problems/number-of-visible-people-in-a-queue)""")
    return


@app.cell
def __():
    from collections import deque
    from bisect import bisect_left
    return bisect_left, deque


@app.cell
def __(List, bisect_left, deque):
    class Solution2:
        def canSeePersonsCount(self, h: List[int]) -> List[int]:
            q, res = deque(), []
            for i in h[::-1]:
                p = bisect_left(q, i)
                p += (1 if len(q) > p else 0)
                res.append(p)
                while q and q[0] <= i:
                    q.popleft()
                q.appendleft(i)
            res.reverse()
            return res
    return (Solution2,)


@app.cell
def __(List):
    class Solution:
        def canSeePersonsCount(self, hs: List[int]) -> List[int]:
            s, res = [], [0] * len(hs)
            for i, h in enumerate(hs):
                while s and hs[s[-1]] <= h:
                    res[s.pop()] += 1
                if s:
                    res[s[-1]] += 1
                s.append(i)
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.canSeePersonsCount([10,6,8,5,11,9]) == [3,1,2,1,1,0]
    return


@app.cell
def __(sol):
    assert sol.canSeePersonsCount([5,1,2,3,10]) == [4,1,1,1,0]
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
