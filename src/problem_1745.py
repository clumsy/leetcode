# time: O(N^3), space: O(N^2)
# class Solution:
#     def checkPartitioning(self, s: str) -> bool:
#         n = len(s)
#         if n == 1:
#             return True
#         self.graph = defaultdict(list)
#         for i in range(2*n-1):
#             self.expand_around(s, i)
#         def dfs(i=0, rem=3):
#             if rem == 1:
#                 return i in self.graph and n-1 == self.graph[i][-1]
#             if i == n and rem == 0:
#                 return True
#             if i >= n:
#                 return False
#             for j in self.graph[i][::-1]:
#                 if dfs(j+1, rem-1):
#                     return True
#             return False
#         return dfs()
#     def expand_around(self, s, i):
#         l = i//2
#         r = (i+1)//2
#         n = len(s)
#         while l >= 0 and r < n and s[l] == s[r]:
#             self.graph[l].append(r)
#             l -= 1
#             r += 1

# time:  O(N^2), space: O(N^2)
class Solution:
    def checkPartitioning(self, s: str) -> bool:
        n = len(s)
        dp = [[False for i in range(n)] for j in range(n)]
        for i in range(n - 1, -1, -1):
            for j in range(i, n):
                dp[i][j] = s[i] == s[j] and (i + 1 > j - 1 or dp[i + 1][j - 1])
        for i in range(1, n - 1):
            for j in range(i, n - 1):
                if dp[0][i - 1] and dp[i][j] and dp[j + 1][n - 1]:
                    return True
        return False
