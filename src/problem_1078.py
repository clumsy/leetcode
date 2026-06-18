class Solution:
    def findOcurrences(self, text: str, first: str, second: str) -> List[str]:
        text = f" {text} "
        res, s, needle = [], -1, f" {first} {second} "
        while (s := text.find(needle, s + 1)) >= 0:
            offset = s + len(needle)
            chunk = text[offset : text.find(" ", offset)]
            if chunk:
                res.append(chunk)
        return res
