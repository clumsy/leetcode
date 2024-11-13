import marimo

__generated_with = "0.3.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2043](https://leetcode.com/problems/simple-bank-system)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Bank:
        def __init__(self, balance: List[int]):
            self.balance = balance

        def transfer(self, account1: int, account2: int, money: int) -> bool:
            account1 -= 1
            account2 -= 1
            if 0 <= account1 < len(self.balance) and 0 <= account2 < len(self.balance) and self.balance[account1] >= money:
                self.balance[account1] -= money
                self.balance[account2] += money
                return True
            return False

        def deposit(self, account: int, money: int) -> bool:
            account -= 1
            if 0 <= account < len(self.balance):
                self.balance[account] += money
                return True
            return False

        def withdraw(self, account: int, money: int) -> bool:
            account -= 1
            if 0 <= account < len(self.balance) and self.balance[account] >= money:
                self.balance[account] -= money
                return True
            return False
    return Bank,


@app.cell
def __(Bank):
    sol = Bank([10, 100, 20, 50, 30])
    assert sol.withdraw(3, 10)
    assert sol.transfer(5, 1, 20)
    assert sol.deposit(5, 20)
    assert not sol.transfer(3, 4, 15)
    assert not sol.withdraw(10, 50)
    return sol,


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
