import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2571](https://leetcode.com/problems/minimum-operations-to-reduce-an-integer-to-0)")
    return


@app.cell
def __():
    from collections import deque
    return deque,


@app.cell
def __(deque):
    class Solution2:
        def minOperations(self, n: int) -> int:
            res, seen, cur, q = 0, {n}, n, deque([n])
            while True:
                for _ in range(len(q)):
                    cur = q.popleft()
                    if cur == 0:
                        break
                    i = 0
                    while (1 << i) <= cur:
                        nxt = cur + (1 << i)
                        if nxt not in seen:
                            seen.add(nxt)
                            q.append(nxt)
                        nxt = cur - (1 << i)
                        if nxt not in seen:
                            seen.add(nxt)
                            q.append(nxt)
                        i += 1
                if cur == 0:
                    break
                res += 1
            return res
    return Solution2,


@app.cell
def __():
    class Solution:
        def minOperations(self, n: int) -> int:
            res = 0
            while n:
                if n & 3 == 3:
                    n += 1
                    res += 1
                n, r = divmod(n, 2)
                res += r
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minOperations(39) == 3
    return


@app.cell
def __(sol):
    assert sol.minOperations(54) == 3
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
