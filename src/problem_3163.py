import marimo

__generated_with = "0.6.13"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(rf"[Problem 3163](https://leetcode.com/problems/string-compression-iii)")
    return


@app.cell
def __():
    class Solution:
        def compressedString(self, w: str) -> str:
            res, cnt = [], 0
            for i in range(len(w)):
                if cnt == 9 or (i > 0 and w[i] != w[i - 1]):
                    res.append(str(cnt))
                    res.append(w[i - 1])
                    cnt = 0
                cnt += 1
            res.append(str(cnt))
            res.append(w[-1])
            res = "".join(res)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.compressedString("abcde") == "1a1b1c1d1e"
    return


@app.cell
def __(sol):
    assert sol.compressedString("aaaaaaaaaaaaaabb") == "9a5a2b"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
