package leetcode;

import java.util.*;

@BeatsPercent(100)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.QUADRATIC_N)
public class Problem126 {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> words = new HashSet<>(wordList);
        List<List<String>> result = new ArrayList<>();
        if (!words.contains(endWord)) {
            return result;
        }
        Map<String, List<String>> map = getChildren(beginWord, endWord, words); // BFS
        List<String> path = new ArrayList<>();
        path.add(beginWord);
        findLadders(beginWord, endWord, map, result, path); // DFS
        return result;
    }

    public void findLadders(String current, String endWord, Map<String, List<String>> map,
                            List<List<String>> result, List<String> path) {
        if (current.equals(endWord)) {
            result.add(new ArrayList<>(path));
            return;
        }
        if (!map.containsKey(current)) {
            return;
        }
        for (String next : map.get(current)) {
            path.add(next);
            findLadders(next, endWord, map, result, path);
            path.remove(path.size() - 1);
        }
    }

    public Map<String, List<String>> getChildren(String beginWord, String endWord, Set<String> words) {
        Set<String> start = new HashSet<>();
        start.add(beginWord);
        Set<String> end = new HashSet<>();
        end.add(endWord);
        Map<String, List<String>> map = new HashMap<>();
        boolean found = false;
        boolean isBackward = false;
        while (!start.isEmpty() && !found) {
            if (start.size() > end.size()) {
                Set<String> tmp = start;
                start = end;
                end = tmp;
                isBackward = !isBackward;
            }
            Set<String> set = new HashSet<>();
            for (String current : start) {
                words.remove(current); // visited
                for (String next : getNext(current, words)) {
                    if (start.contains(next)) {
                        continue;
                    }
                    if (end.contains(next)) {
                        found = true; // this iteration is the last one because other paths would be longer
                    }
                    set.add(next);
                    String parent = isBackward ? next : current;
                    String child = isBackward ? current : next;
                    List<String> children = map.get(parent);
                    if (children == null) {
                        children = new ArrayList<>();
                        map.put(parent, children);
                    }
                    children.add(child);
                }
            }
            start = set;
        }
        return map;
    }
    
    private List<String> getNext(String current, Set<String> words) {
        List<String> result = new ArrayList<>();
        char[] chars = current.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char old = chars[i];
            for (char c = 'a'; c <= 'z'; c++) {
                if (c == old) {
                    continue;
                }
                chars[i] = c;
                String next = new String(chars);
                if (words.contains(next)) {
                    result.add(next);
                }
            }
            chars[i] = old;
        }
        return result;
    }
}
