import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 636](https://leetcode.com/problems/exclusive-time-of-functions)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def exclusiveTime(self, n: int, logs: List[str]) -> List[int]:
            res = [0] * n
            st, t0 = [], 0
            for s in logs:
                i, e, t = s.split(":")
                i, t = int(i), int(t)
                if e == "start":
                    if st:
                        res[st[-1]] += t - t0
                    st.append(i)
                    t0 = t
                else:
                    res[st.pop()] += t + 1 - t0
                    t0 = t + 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.exclusiveTime(2, ["0:start:0","1:start:2","1:end:5","0:end:6"]) == [3,4]
    return


@app.cell
def __(sol):
    assert sol.exclusiveTime(1, ["0:start:0","0:start:2","0:end:5","0:start:6","0:end:6","0:end:7"]) == [8]
    return


@app.cell
def __(sol):
    assert sol.exclusiveTime(2,["0:start:0","0:start:2","0:end:5","1:start:6","1:end:6","0:end:7"]) == [7,1]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
