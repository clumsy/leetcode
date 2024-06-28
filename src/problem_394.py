import marimo

__generated_with = "0.6.23"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 394](https://leetcode.com/problems/decode-string/description)")
    return


@app.cell
def __():
    class Solution:
        def decodeString(self, s: str) -> str:
            st, n, res = [], 0, ""
            for c in s:
                if c.isdigit():
                    n = n * 10 + int(c)
                elif c == "[":
                    st.append((n, res))
                    n, res = 0, ""
                elif c == "]":
                    n, prev = st.pop()
                    res, n = prev + res * n, 0
                else:
                    res += c
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.decodeString("3[a]2[bc]") == "aaabcbc"
    return


@app.cell
def __(sol):
    assert sol.decodeString("3[a2[c]]") == "accaccacc"
    return


@app.cell
def __(sol):
    assert sol.decodeString("2[abc]3[cd]ef") == "abcabccdcdcdef"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
