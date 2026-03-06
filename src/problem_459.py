class Solution:
    def repeatedSubstringPattern(self, s: str) -> bool:
        # Pattern -> atternPatternPatternPattern
        # if Pattern is repeated - then it at least has 2 occurences => 4 in concatenation with self
        # croping from both ends - then there should be at least 2 occurences
        res = s in (s + s)[1:-1]
        return res
