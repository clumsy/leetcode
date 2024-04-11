import marimo

__generated_with = "0.3.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2062](https://leetcode.com/problems/count-vowel-substrings-of-a-string)")
    return


@app.cell
def __():
    class Solution:
        def countVowelSubstrings(self, word: str) -> int:
            vowels = "aeiou"
            res, last_consonant_pos = 0, -1
            last_seen_vowel_pos = {v: -1 for v in vowels}
            for i, x in enumerate(word):
                if x not in vowels:
                    last_consonant_pos = i
                else:
                    last_seen_vowel_pos[x] = i
                    res += max(min(last_seen_vowel_pos.values()) - last_consonant_pos, 0)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countVowelSubstrings("aeiouu") == 2
    return


@app.cell
def __(sol):
    assert sol.countVowelSubstrings("unicornarihan") == 0
    return


@app.cell
def __(sol):
    assert sol.countVowelSubstrings("cuaieuouac") == 7
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
