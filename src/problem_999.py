import marimo

__generated_with = "0.4.5"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 999](https://leetcode.com/problems/available-captures-for-rook)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def numRookCaptures(self, board: List[List[str]]) -> int:
            rows, cols = len(board), len(board[0])

            def count(r, c, res, prev):
                cur = board[r][c]
                if cur == "R":
                    res += prev == "p"
                elif cur == "p":
                    res += prev == "R"
                return res, cur if cur != "." else prev

            res = 0
            for r in range(rows):
                prev = "."
                for c in range(cols):
                    res, prev = count(r, c, res, prev)

            for c in range(cols):
                prev = "."
                for r in range(rows):
                    res, prev = count(r, c, res, prev)

            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    board1 = [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
    assert sol.numRookCaptures(board1) == 3
    return board1,


@app.cell
def __(sol):
    board2 = [[".",".",".",".",".",".",".","."],[".","p","p","p","p","p",".","."],[".","p","p","B","p","p",".","."],[".","p","B","R","B","p",".","."],[".","p","p","B","p","p",".","."],[".","p","p","p","p","p",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
    assert sol.numRookCaptures(board2) == 0
    return board2,


@app.cell
def __(sol):
    board3 = [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","p",".",".",".","."],["p","p",".","R",".","p","B","."],[".",".",".",".",".",".",".","."],[".",".",".","B",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."]]
    assert sol.numRookCaptures(board3) == 3
    return board3,


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
