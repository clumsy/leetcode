# class Solution:
#     def countWordOccurrences(self, cs: list[str], qs: list[str]) -> list[int]:
#         cur = root = {}
#         cs[-1] += " "
#         cs = cs[::-1]
#         p, pc = root, "-"
#         while cs:
#             w = cs.pop()
#             for i, c in enumerate(w):
#                 if c == " " or pc == c == "-" or (c == "-" and pc == " "):
#                     cnt = p if pc == "-" else cur
#                     cnt["#"] = cnt.get("#", 0) + 1
#                     n = len(w)
#                     while i < n and w[i] == c:
#                         i += 1
#                     if i < n:
#                         cs.append(w[i:])
#                     cur, p, pc = root, cur, c
#                     break
#                 if c not in cur:
#                     cur[c] = {}
#                 cur, p, pc = cur[c], cur, c
#         res = [0] * len(qs)
#         for i, q in enumerate(qs):
#             cur, cnt = root, 0
#             for c in q:
#                 if c not in cur:
#                     break
#                 cur = cur[c]
#             else:
#                 res[i] = cur.get("#", 0)
#         return res


class Solution:
    def countWordOccurrences(self, cs: list[str], qs: list[str]) -> list[int]:
        s = "".join(cs).replace("--", "  ").replace(" -", "  ").replace("- ", " ")
        cnt = Counter(s.strip("-").split())
        res = [cnt[q] for q in qs]
        return res
