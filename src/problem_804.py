class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        morse = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        def as_morse(s):
            return "".join(morse[ord(c) - ord("a")] for c in s)
        res = len(set(as_morse(w) for w in words))
        return res
