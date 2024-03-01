import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2182](https://leetcode.com/problems/construct-string-with-repeat-limit)")
    return


@app.cell
def __():
    from collections import Counter
    from heapq import heapify, heappop, heappush
    return Counter, heapify, heappop, heappush


@app.cell
def __(Counter, heapify, heappop, heappush):
    class Solution:
        def repeatLimitedString(self, s: str, r: int) -> str:
            res = []
            q = [(-ord(c), i, c) for c, i in Counter(s).items()]
            heapify(q)
            while q:
                o, i, c = heappop(q)
                cnt = min(i, r)
                i -= cnt
                res.append(c * cnt)
                if i:
                    if not q:
                        break
                    o2, i2, c2 = heappop(q)
                    i2 -= 1
                    res.append(c2)
                    heappush(q, (o, i, c))
                    if i2:
                        heappush(q, (o2, i2, c2))
            res = "".join(res)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.repeatLimitedString("cczazcc", 3) == "zzcccac"
    return


@app.cell
def __(sol):
    assert sol.repeatLimitedString("aababab", 2) == "bbabaa"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
