package leetcode;

import java.util.*;

public class Problem692 {
    public static final class Alternative1 extends Problem692 {

        @Override
        public List<String> topKFrequent(String[] words, int k) {
            if (words.length == 0) {
                return Collections.emptyList();
            }
            Map<String, Integer> counts = new HashMap<>(words.length, 1f);
            for (String word : words) {
                counts.compute(word, (key, count) -> {
                    if (count == null) {
                        count = 0;
                    }
                    return count + 1;
                });
            }
            Comparator<String> comparator = (word1, word2) -> {
                int countDiff = counts.get(word1) - counts.get(word2);
                if (countDiff != 0) {
                    return countDiff;
                }
                return word2.compareTo(word1);
            };
            PriorityQueue<String> maxHeap = new PriorityQueue<>(comparator);
            for (String word : counts.keySet()) {
                maxHeap.add(word);
                if (maxHeap.size() > k) {
                    maxHeap.poll();
                }
            }
            ArrayList<String> result = new ArrayList<>(maxHeap);
            result.sort(comparator.reversed());
            return result;
        }
    }

    public static final class Alternative2 extends Problem692 {

        @Override
        public List<String> topKFrequent(String[] words, int k) {
            int length = words.length;
            if (length == 0) {
                return Collections.emptyList();
            }
            Map<String, Integer> counts = new HashMap<>(length, 1f);
            for (String word : words) {
                counts.compute(word, (key, count) -> {
                    if (count == null) {
                        count = 0;
                    }
                    return count + 1;
                });
            }
            TrieNode[] roots = new TrieNode[length + 1];
            for (Map.Entry<String, Integer> entry : counts.entrySet()) {
                String word = entry.getKey();
                int count = entry.getValue();
                TrieNode root = roots[count];
                if (root == null) {
                    root = new TrieNode();
                    roots[count] = root;
                }
                addWord(root, word);
            }
            LinkedList<String> result = new LinkedList<>();
            for (int i = length; i >= 0 && result.size() < k; i--) {
                TrieNode root = roots[i];
                getWords(root, result, k);
            }
            return result;
        }

        private void getWords(TrieNode root, List<String> result, int k) {
            if (root == null) {
                return;
            }
            if (root.word != null) {
                result.add(root.word);
            }
            if (result.size() == k) {
                return;
            }
            for (TrieNode next : root.next) {
                if (next != null) {
                    getWords(next, result, k);
                }
            }
        }

        private void addWord(TrieNode root, String word) {
            for (char c : word.toCharArray()) {
                int val = c - 'a';
                if (root.next[val] == null) {
                    root.next[val] = new TrieNode();
                }
                root = root.next[val];
            }
            root.word = word;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        int length = words.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        Map<String, Integer> counts = new HashMap<>(length, 1f);
        for (String word : words) {
            counts.compute(word, (key, count) -> {
                if (count == null) {
                    count = 0;
                }
                return count + 1;
            });
        }
        List<String>[] lists = new List[length + 1];
        counts.forEach((word, count) -> {
            List<String> list = lists[count];
            if (list == null) {
                list = new ArrayList<>();
                lists[count] = list;
            }
            list.add(word);
        });
        List<String> result = new ArrayList<>(k);
        for (int i = length; i > 0; --i) {
            List<String> list = lists[i];
            if (list != null) {
                Collections.sort(list);
                for (String word : list) {
                    result.add(word);
                    if (--k == 0) {
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
