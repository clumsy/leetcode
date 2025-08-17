class Solution:
    def minProcessingTime(self, processorTime: List[int], tasks: List[int]) -> int:
        tasks.sort()
        processorTime.sort(reverse=True)
        res = max(p + tasks[4 * i + 3] for i, p in enumerate(processorTime))
        return res
