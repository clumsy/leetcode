class Solution:
    def reinitializePermutation(self, n: int) -> int:
        res, one = 0, 1
        # we simulate how a single index moves
        # and stop when it goes back to where it started
        while res == 0 or one > 1:
            one = (2 * one) % (n - 1)
            res += 1
        return res
