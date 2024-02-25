import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 752](https://leetcode.com/problems/open-the-lock)")
    return


@app.cell
def __():
    from typing import List
    from collections import deque
    return List, deque


@app.cell
def __(List, deque):
    class Solution:
        def openLock(self, deadends: List[str], target: str) -> int:
            n = len(target)
            def convert(s):
                return tuple(int(d) for d in s)
            target = convert(target)
            seen = set(convert(d) for d in deadends)
            start = convert("0000")
            q = deque([start] if start not in seen else [])
            res, cur = 0, None
            while q:
                for _ in range(len(q)):
                    cur = q.popleft()
                    if cur == target:
                        break
                    for i in range(n):
                        nxt1 = tuple((cur[j] + (i == j)) % 10 for j in range(n))
                        if nxt1 not in seen:
                            seen.add(nxt1)
                            q.append(nxt1)
                        nxt2 = tuple((cur[j] - (i == j)) % 10 for j in range(n))
                        if nxt2 not in seen:
                            seen.add(nxt2)
                            q.append(nxt2)
                if cur == target:
                    break
                res += 1
            res = res if cur == target else -1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.openLock(["0201","0101","0102","1212","2002"], "0202") == 6
    return


@app.cell
def __(sol):
    assert sol.openLock(["8888"], "0009") == 1
    return


@app.cell
def __(sol):
    assert sol.openLock(["8887","8889","8878","8898","8788","8988","7888","9888"], "8888") == -1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
