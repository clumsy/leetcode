class Solution:
    def vowelStrings(self, words: List[str], left: int, right: int) -> int:
        vowels = "aeiou"
        res = sum(w[0] in vowels and w[-1] in vowels for w in words[left:right + 1])
        return res
