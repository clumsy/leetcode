class Solution:
    def countPrefixes(self, words: List[str], s: str) -> int:
        trie = {}
        for word in words:
            p = trie
            for c in word:
                t = p.get(c, {"__count__": 0})
                p[c] = t
                p = t
            p["__count__"] += 1
        res = 0
        for c in s:
            trie = trie.get(c, None)
            if not trie:
                break
            res += trie["__count__"]
        return res
