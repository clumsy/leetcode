class Solution:
    def accountBalanceAfterPurchase(self, purchaseAmount: int) -> int:
        res = 100 - 10 * ((purchaseAmount + 5) // 10)
        return res
