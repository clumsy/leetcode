class Solution:
    def suggestedProducts(self, products: List[str], searchWord: str) -> List[List[str]]:
        trie = {}
        for product in products:
            prev = trie
            for c in product:
                t = prev.get(c, {})
                prev[c] = t
                p = t.get("__products__", [])
                insort(p, product)
                t["__products__"] = p
                prev = t
        res = []
        for c in searchWord:
            trie = trie.get(c, {})
            p = trie.get("__products__", [])
            res.append(p[: min(3, len(p))])
        return res
