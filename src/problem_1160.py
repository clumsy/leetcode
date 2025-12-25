class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        cnt = Counter(chars)
        res = sum(len(word) for word in words if all(v <= cnt.get(k, 0) for k, v in Counter(word).items()))
        return res
