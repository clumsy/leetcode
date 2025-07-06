class Solution:
    def largestWordCount(self, messages: List[str], senders: List[str]) -> str:
        res, cnt = None, Counter()
        for i in range(len(messages)):
            cnt[(s := senders[i])] += messages[i].count(" ") + 1
            if not res or cnt[s] >= cnt[res]:
                res = max(res, s) if res and cnt[s] == cnt[res] else s
        return res
