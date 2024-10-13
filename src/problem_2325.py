import marimo

__generated_with = "0.9.4"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2325](https://leetcode.com/problems/decode-the-message)""")
    return


@app.cell
def __():
    class Solution:
        def decodeMessage(self, key: str, message: str) -> str:
            table = {" ": " "}
            for c in key:
                if c not in table:
                    table[c] = chr(ord("a") + len(table) - 1)
            res = "".join(table[c] for c in message)
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv") == "this is a secret"
    return


@app.cell
def __(sol):
    assert sol.decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb") == "the five boxing wizards jump quickly"
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
