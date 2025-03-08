class Solution:
    def numberOfLines(self, widths: List[int], s: str) -> List[int]:
        lines, last = 1, 0
        for c in s:
            width = widths[ord(c) - ord("a")]
            if last + width > 100:
                last = width
                lines += 1
            else:
                last += width
        return [lines, last]
