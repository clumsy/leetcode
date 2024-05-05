import marimo

__generated_with = "0.4.10"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 946](https://leetcode.com/problems/validate-stack-sequences)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def validateStackSequences(self, pushed: List[int], popped: List[int]) -> bool:
            st = []
            po = 0
            for pu in pushed:
                st.append(pu)
                while st and popped[po] == st[-1]:
                    po += 1
                    st.pop()
            res = len(st) == 0
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.validateStackSequences([1,2,3,4,5], [4,5,3,2,1])
    return


@app.cell
def __(sol):
    assert not sol.validateStackSequences([1,2,3,4,5], [4,3,5,1,2])
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
