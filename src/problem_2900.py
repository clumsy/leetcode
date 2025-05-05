# class Solution:
#     def getWordsInLongestSubsequence(self, n: int, words: List[str], groups: List[int]) -> List[str]:
#         seq = [[], []]
#         for i in range(n):
#             for s in seq:
#                 if not s or groups[s[-1]] != groups[i]:
#                     s.append(i)
#         res = [words[i] for i in max(seq)]
#         return res

class Solution:
    def getWordsInLongestSubsequence(self, n: int, words: List[str], groups: List[int]) -> List[str]:
        last, res = (None, [])
        for w, g in zip(words, groups):
            if g != last:
                res.append(w)
                last = g
        return res
