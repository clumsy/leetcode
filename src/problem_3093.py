class Solution:
    def stringIndices(self, wc: List[str], wq: List[str]) -> List[int]:
        class Trie:
            def __init__(self):
                self.nxt = {}
                self.sml = -1

            def add(self, s, i):
                cur = self
                for c in s:
                    if c not in cur.nxt:
                        cur.nxt[c] = Trie()
                    if cur.sml < 0 or len(s) < len(wc[cur.sml]):
                        cur.sml = i
                    cur = cur.nxt[c]
                if cur.sml < 0 or len(s) < len(wc[cur.sml]):
                    cur.sml = i

            def find(self, s):
                cur = self
                for c in s:
                    if c not in cur.nxt:
                        break
                    cur = cur.nxt[c]
                return cur.sml
        
        trie = Trie()
        for i, w in enumerate(wc):
            trie.add(w[::-1], i)
        res = [0] * len(wq)
        for i, w in enumerate(wq):
            res[i] = trie.find(w[::-1])
        return res
