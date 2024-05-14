import marimo

__generated_with = "0.5.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 925](https://leetcode.com/problems/long-pressed-name)")
    return


@app.cell
def __():
    class Solution:
        def isLongPressedName(self, name: str, typed: str) -> bool:
            res, i, n, j, m = True, 0, len(name), 0, len(typed)
            while i < n and j < m:
                if name[i] != typed[j]:
                    res = False
                    break
                ei = i
                while ei + 1 < n and name[ei + 1] == name[i]:
                    ei += 1
                ej = j
                while ej + 1 < m and typed[ej + 1] == name[i]:
                    ej += 1
                if ei - i + 1 > ej - j + 1:
                    res = False
                    break
                i, j = ei + 1, ej + 1
            res = res and j == m and i == n
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.isLongPressedName("alex", "aaleex")
    return


@app.cell
def __(sol):
    assert not sol.isLongPressedName("saeed", "ssaaedd")
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
