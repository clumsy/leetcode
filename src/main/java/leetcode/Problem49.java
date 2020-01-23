package leetcode;

import java.util.*;

public class Problem49 {

    public static final class Alternative extends Problem49 {

        @Override
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> anagrams = new HashMap<>(strs.length, 1f);
            List<List<String>> result = new ArrayList<>(strs.length);
            for (String str : strs) {
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                anagrams.compute(String.valueOf(chars), (k, v) -> {
                    if (v == null) {
                        v = new ArrayList<>();
                        result.add(v);
                    }
                    v.add(str);
                    return v;
                });
            }
            return result;
        }
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>(strs.length, 1f);
        List<List<String>> result = new ArrayList<>(strs.length);
        for (String str : strs) {
            char[] counts = new char[26];
            for (char c : str.toCharArray()) {
                counts[c - 'a']++;
            }
            String key = String.valueOf(counts);
            List<String> list = anagrams.get(key);
            if (list == null) {
                list = new ArrayList<>();
                result.add(list);
                anagrams.put(key, list);
            }
            list.add(str);
        }
        return result;
    }
}
