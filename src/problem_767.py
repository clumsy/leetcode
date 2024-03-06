import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 767](https://leetcode.com/problems/reorganize-string)")
    return


@app.cell
def __():
    from collections import Counter
    from heapq import heapify, heappush, heappop
    return Counter, heapify, heappop, heappush


@app.cell
def __(Counter, heapify, heappop, heappush):
    class Solution2:
        def reorganizeString(self, s: str) -> str:
            ord = [(-i, c) for c, i in Counter(s).most_common()]
            heapify(ord)
            res = []
            i1, c1 = heappop(ord)
            i1 *= -1
            while i1:
                res.append(c1)
                if ord:
                    i2, c2 = heappop(ord)
                    i2 *= -1
                else:
                    i2, c2 = None, None
                i1 -= 1
                if i1 > 0:
                    heappush(ord, (-i1, c1))
                i1, c1 = i2, c2 if i2 else (None, None)
            res = "".join(res) if not ord else ""
            return res
    return Solution2,


@app.cell
def __(Counter):
    class Solution:
        def reorganizeString(self, s: str) -> str:
            cnt = [[c, i] for c, i in Counter(s).most_common()[::-1]]
            n = len(s)
            if cnt[-1][1] <= (n + 1) // 2:
                res = [None] * n
                for i in range(0, n, 2):
                    if not cnt:
                        res = []
                        break
                    last = cnt[-1]
                    res[i] = last[0]
                    last[1] -= 1
                    if last[1] == 0:
                        cnt.pop()
                for i in range(1, n, 2):
                    if not cnt:
                        res = []
                        break
                    last = cnt[-1]
                    res[i] = last[0]
                    last[1] -= 1
                    if last[1] == 0:
                        cnt.pop()
            else:
                res = []
            res = "".join(res)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.reorganizeString("aab") == "aba"
    return


@app.cell
def __(sol):
    assert sol.reorganizeString("aaab") == ""
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
