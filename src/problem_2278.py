class Solution:
    def percentageLetter(self, s: str, letter: str) -> int:
        res = (100 * s.count(letter)) // len(s)
        return res
