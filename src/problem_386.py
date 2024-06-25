import marimo

__generated_with = "0.6.22"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 386](https://leetcode.com/problems/lexicographical-numbers)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution2:
        def lexicalOrder(self, n: int) -> List[int]:
            st = [str(i) for i in range(1, min(10, n + 1))[::-1]]
            res = []
            while st:
                c = st.pop()
                cur = int(c)
                if cur <= n:
                    res.append(cur)
                    for i in range(10)[::-1]:
                        st.append(c + str(i))
            return res
    return Solution2,


@app.cell
def __(List):
    class Solution:
        def lexicalOrder(self, n: int) -> List[int]:
            res, cur = ([], 1)
            for _ in range(n):
                res.append(cur)
                if cur * 10 <= n:
                    cur *= 10
                else:
                    if cur >= n:
                        cur //= 10
                    cur += 1
                    while cur % 10 == 0:
                        cur //= 10
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.lexicalOrder(13) == [1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9]
    return


@app.cell
def __(sol):
    assert sol.lexicalOrder(2) == [1, 2]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
