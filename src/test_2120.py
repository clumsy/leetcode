import collections


def executeInstructions(n, start, s):
    ns = len(s)
    (x0, y0), (x, y) = start, (0, 0)
    res = list(range(ns, 0, -1))
    count = collections.defaultdict(set)
    count[x0, None].add(0)
    count[None, y0].add(0)
    for i in range(ns):
        if s[i] == 'L': y -= 1
        if s[i] == 'R': y += 1
        if s[i] == 'U': x -= 1
        if s[i] == 'D': x += 1
        count[x0 - x, None].add(i + 1)  # starting from x0-x we get to x0 x-axis coordinate in i+1 steps
        count[None, y0 - y].add(i + 1)  # starting from y0-y we get to y0 y-axis coordinate in i+1 steps
        # from these points we'd get off grid with the current offsets
        for key in [(n - x, None), (None, n - y), (-x - 1, None), (None, -y - 1)]:
            for j in count[key]:
                res[j] = min(res[j], i - j)  # can get off grid by x or y - choosing the shortest path
            count[key] = set()
    return res

print(executeInstructions(3, [0, 1], "RRDDLU"))