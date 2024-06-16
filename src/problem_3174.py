import marimo

__generated_with = "0.6.19"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(rf"[Problem 3174](https://leetcode.com/problems/clear-digits)")
    return


@app.cell
def __():
    class Solution:
        def clearDigits(self, s: str) -> str:
            st = []
            for c in s:
                if c in "0123456789":
                    if st:
                        st.pop()
                else:
                    st.append(c)
            res = "".join(st)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.clearDigits("abc") == "abc"
    return


@app.cell
def __(sol):
    assert sol.clearDigits("cb34") == ""
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
