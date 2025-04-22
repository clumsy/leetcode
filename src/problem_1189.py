class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        text_freq = collections.Counter(text)
        balloon_freq = collections.Counter('balloon')
        return min([text_freq[c] // balloon_freq[c] for c in balloon_freq])
