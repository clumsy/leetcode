class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"}
        count = lambda x: sum(1 for c in x if c in vowels)
        return count(s[:len(s) // 2]) == count(s[len(s) // 2:])
