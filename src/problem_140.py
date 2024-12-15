class Trie:
    def __init__(self):
        self.nxt = {}
        self.trm = False
    
    def add(self, s):
        cur = self
        for c in s:
            if c not in cur.nxt:
                cur.nxt[c] = Trie()
            cur = cur.nxt[c]
        cur.trm = True

class Solution:
    def wordBreak(self, s: str, wd: List[str]) -> List[str]:
        trie = Trie()
        for w in wd:
            trie.add(w)
        res = []
        def dfs(s, st=[]):
            if not s:
                res.append(" ".join(st))
                return
            cur = trie
            for i, c in enumerate(s):
                if c not in cur.nxt:
                    break
                cur = cur.nxt[c]
                if cur.trm:
                    st.append(s[:i + 1])
                    dfs(s[i + 1:])
                    st.pop()
        dfs(s)
        return res
