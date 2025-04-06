class Solution:
    def numSpecialEquivGroups(self, words: List[str]) -> int:

        def canonical(w):
            return "".join(sorted(w[:len(w):2]) + sorted(w[1:len(w):2]))

        can = set(canonical(w) for w in words)
        return len(can)
