class Solution:
    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
        n = len(image)
        for r in image:
            for i in range((n + 1) // 2):
                r[i], r[n - 1 - i] = 1 - r[n - 1 - i], 1 - r[i]
        return image
