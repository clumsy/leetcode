import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3015](https://leetcode.com/problems/count-the-number-of-houses-at-a-certain-distance-i)")
    return


@app.cell
def __():
    from typing import List
    from collections import deque
    return List, deque


@app.cell
def __(List, deque):
    class Solution2:
        def countOfPairs(self, n: int, x: int, y: int) -> List[int]:
            res = [0] * n
            for i in range(n):
                seen, q, d = set([i]), deque([i]), 0
                while q and len(seen) < n:
                    for _ in range(len(q)):
                        cur = q.popleft()
                        if cur not in seen:
                            seen.add(cur)
                            res[d - 1] += 1
                        if cur > 0 and cur - 1 not in seen:
                            q.append(cur - 1)
                        if cur < n - 1 and cur + 1 not in seen:
                            q.append(cur + 1)
                        if cur == x - 1 and y - 1 not in seen:
                            q.append(y - 1)
                        if cur == y - 1 and x - 1 not in seen:
                            q.append(x - 1)
                    d += 1
            return res
    return Solution2,


@app.cell
def __(List):
    class Solution:
        def countOfPairs(self, n: int, x: int, y: int) -> List[int]:
            res = [0] * n
            x, y = min(x, y), max(x, y)
            for i in range(1, n + 1):
                for j in range(i + 1, n + 1):
                    d = min(j - i, abs(i - x) + 1 + abs(j - y))
                    if d:
                        res[d - 1] += 2   # for both (i, j) and (j, i)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countOfPairs(3, 1, 3) == [6,0,0]
    return


@app.cell
def __(sol):
    assert sol.countOfPairs(5, 2, 4) == [10,8,2,0,0]
    return


@app.cell
def __(sol):
    assert sol.countOfPairs(4, 1, 1) == [6,4,2,0]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
