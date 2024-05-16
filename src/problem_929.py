import marimo

__generated_with = "0.5.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 929](https://leetcode.com/problems/unique-email-addresses)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def numUniqueEmails(self, emails: List[str]) -> int:
            def prune(email):
                name, domain = email.split("@")
                sep = name.find("+")
                name = (name if sep < 0 else name[:sep]).replace(".", "")
                return name + "@" + domain
            res = len(set(prune(email) for email in emails))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.numUniqueEmails(["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]) == 2
    return


@app.cell
def __(sol):
    assert sol.numUniqueEmails(["a@leetcode.com","b@leetcode.com","c@leetcode.com"]) == 3
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
