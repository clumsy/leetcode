class Solution:
    def removeDigit(self, number: str, digit: str) -> str:
        number = list(number)
        n, last = len(number), None
        for i in range(n):
            if number[i] == digit:
                last = i
                if i < n - 1 and number[i + 1] > number[i]:
                    break
        if last is not None:
            number[last] = ""
        res = "".join(number)
        return res
