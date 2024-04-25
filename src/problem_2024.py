import marimo

__generated_with = "0.4.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2024](https://leetcode.com/problems/maximize-the-confusion-of-an-exam)")
    return


@app.cell
def __():
    class Solution:
        def maxConsecutiveAnswers(self, answerKey: str, k: int) -> int:
            res_t = res_f = 0
            cur_t = cur_f = 0
            k_t = k_f = k
            for i, a in enumerate(answerKey):
                if a == "T":
                    cur_t += 1
                    if k_f > 0:
                        k_f -= 1
                        cur_f += 1
                    else:
                        while cur_f > 0 and answerKey[i - cur_f] == "F":
                            cur_f -= 1
                else:
                    cur_f += 1
                    if k_t > 0:
                        k_t -= 1
                        cur_t += 1
                    else:
                        while cur_t > 0 and answerKey[i - cur_t] == "T":
                            cur_t -= 1
                res_t = max(res_t, cur_t)
                res_f = max(res_f, cur_f)
            res = max(res_t, res_f)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maxConsecutiveAnswers("TTFF", 2) == 4
    return


@app.cell
def __(sol):
    assert sol.maxConsecutiveAnswers("TFFT", 1) == 3
    return


@app.cell
def __(sol):
    assert sol.maxConsecutiveAnswers("TTFTTFTT", 1) == 5
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
