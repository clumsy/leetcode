class Solution:
    def removeDuplicates(self, s: str) -> str:
        s, i = list(s), 0
        for j in range(len(s)):
            s[i] = s[j]  # remembering current character
            if i > 0 and s[i - 1] == s[i]:
                i -= 2  # 2 characters in a row, popping
            i += 1  # moving to next position
        res = "".join(s[:i]) # what's left unmatched
        return res
