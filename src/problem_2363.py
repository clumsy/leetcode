import marimo

__generated_with = "0.9.14"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2363](https://leetcode.com/problems/merge-similar-items)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def mergeSimilarItems(self, items1: List[List[int]], items2: List[List[int]]) -> List[List[int]]:
            vs = {}
            for v, w in items1:
                vs[v] = w + vs.get(v, 0)
            for v, w in items2:
                vs[v] = w + vs.get(v, 0)
            res = [[v, vs[v]] for v in sorted(vs.keys())]
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.mergeSimilarItems([[1,1],[4,5],[3,8]], [[3,1],[1,5]]) == [[1,6],[3,9],[4,5]]
    return


@app.cell
def __(sol):
    assert sol.mergeSimilarItems([[1,1],[3,2],[2,3]], [[2,1],[3,2],[1,3]]) == [[1,4],[2,4],[3,4]]
    return


@app.cell
def __(sol):
    assert sol.mergeSimilarItems([[1,3],[2,2]], [[7,1],[2,2],[1,4]]) == [[1,7],[2,4],[7,1]]
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
