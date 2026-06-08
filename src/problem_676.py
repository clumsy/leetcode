class MagicDictionary:
    def __init__(self):
        self.words = defaultdict(set)

    def buildDict(self, dictionary: List[str]) -> None:
        for w in dictionary:
            for i in range(len(w)):
                self.words[w[:i] + "$" + w[i + 1 :]].add(w)

    def search(self, sw: str) -> bool:
        for i in range(len(sw)):
            matches = self.words.get(sw[:i] + "$" + sw[i + 1 :])
            if matches:
                for m in matches:
                    if sw[i] != m[i]:
                        return True
        return False
