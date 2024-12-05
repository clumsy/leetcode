class Solution:
    def longestCommonPrefix(self, arr1: List[int], arr2: List[int]) -> int:
        pfx = set()
        for a1 in arr1:
            while a1:
                pfx.add(a1)
                a1 //= 10
        res = 0
        for a2 in arr2:
            cur = len(str(a2))
            while a2:
                if a2 in pfx:
                    break
                cur -= 1
                a2 //= 10
            res = max(res, cur)
        return res

# class Trie:
#     def __init__(self):
#         self.nxt = [None] * 10
    
#     def add(self, val):
#         cur = self
#         for d in str(val):
#             if not cur.nxt[int(d)]:
#                 cur.nxt[int(d)] = Trie()
#             cur = cur.nxt[int(d)]
    
#     def find(self, val):
#         res, cur = 0, self
#         for d in str(val):
#             if not cur.nxt[int(d)]:
#                 break
#             cur = cur.nxt[int(d)]
#             res += 1
#         return res

# class Solution:
#     def longestCommonPrefix(self, arr1: List[int], arr2: List[int]) -> int:
#         trie = Trie()
#         for a1 in arr1:
#             trie.add(a1)
#         res = max(trie.find(a2) for a2 in arr2)
#         return res
