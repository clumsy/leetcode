import marimo

__generated_with = "0.7.9"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 2108](https://leetcode.com/problems/find-first-palindromic-string-in-the-array/submissions)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def firstPalindrome(self, words: List[str]) -> str:
            return next(filter(self.is_palindrome, words), '')

        def is_palindrome(self, s):
            lo = 0
            hi = len(s) - 1
            while lo <= hi:
                if s[lo] != s[hi]:
                    return False
                lo += 1
                hi -= 1
            return True
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.firstPalindrome(["abc","car","ada","racecar","cool"]) == "ada"
    return


@app.cell
def __(sol):
    assert sol.firstPalindrome(["notapalindrome","racecar"]) == "racecar"
    return


@app.cell
def __(sol):
    assert sol.firstPalindrome(["def","ghi"]) == ""
    return


@app.cell
def __(sol):
    assert sol.firstPalindrome(["cqllrtyhw","swwisru","gpzmbders","wqibjuqvs","pp","usewxryy","ybqfuh","hqwwqftgyu","jggmatpk"]) == "pp"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
