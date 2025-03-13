class Solution:
    def toGoatLatin(self, sentence: str) -> str:
        res = sentence.split()
        for i in range(len(res)):
            if res[i][0].lower() not in "aeiou":
                res[i] = res[i][1:] + res[i][0]
            res[i] += "ma" + "a" * (i + 1)
        res = " ".join(res)
        return res
