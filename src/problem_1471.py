class Solution:
    def getStrongest(self, arr: List[int], k: int) -> List[int]:
        # both sorts can be changed to quickselect
        arr.sort()
        m = arr[(len(arr) - 1) // 2]

        def order(i):
            return (abs(i - m), i)

        arr.sort(key=order)
        res = arr[-k:]
        return res
