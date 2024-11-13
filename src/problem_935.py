import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 935](https://leetcode.com/problems/knight-dialer)")
    return


@app.cell
def __():
    class Solution:
        def knightDialer(self, n: int) -> int:
            MOD = int(1e9 + 7)
            m = [
                [4, 6],  # 0
                [8, 6],  # 1
                [7, 9],  # 2
                [4, 8],  # 3
                [0, 3, 9],  # 4
                [],  # 5
                [0, 1, 7],  # 6
                [2, 6],  # 7
                [1, 3],  # 8
                [2, 4],  # 9
            ]
            dp = [[1] * 10, [0] * 10]
            for i in range(n):
                for j in range(10):
                    dp[(i + 1) & 1][j] = sum(dp[i & 1][k] for k in m[j]) % MOD
            res = sum(dp[(n - 1) & 1]) % MOD
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.knightDialer(1) == 10
    return


@app.cell
def __(sol):
    assert sol.knightDialer(2) == 20
    return


@app.cell
def __(sol):
    assert sol.knightDialer(3131) == 136006598
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
