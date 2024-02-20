import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1003](https://leetcode.com/problems/check-if-word-is-valid-after-substitutions)")
    return


@app.cell
def __():
    class Solution:
        def isValid(self, s: str) -> bool:
            st, res = [], True
            for c in s:
                if c == "c":
                    if len(st) < 2 or st.pop() != "b" or st.pop() != "a":
                        res = False
                        break
                else:
                    st.append(c)
            res = res and not st
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.isValid("aabcbc")
    return


@app.cell
def __(sol):
    assert sol.isValid("abcabcababcc")
    return


@app.cell
def __(sol):
    assert not sol.isValid("abccba")
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
