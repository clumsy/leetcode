package leetcode;

import java.util.*;

public class Problem46 {
    public static class Alternative extends Problem46 {

        @Override
        public List<List<Integer>> permute(int[] nums) {
            int length = nums.length;
            if (length == 0) {
                return Collections.emptyList();
            }
            List<List<Integer>> result = new ArrayList<>(1 << length);
            int[] indices = new int[length];
            for (int i = 0; i < length; i++) {
                indices[i] = i;
            }
            collectPermutations(result, nums, new int[length], indices, length);
            return result;
        }

        private void collectPermutations(List<List<Integer>> result, int[] input,
                                         int[] current, int[] indices, int remaining) {
            int length = current.length;
            if (remaining <= 0) {
                List<Integer> resultItem = new ArrayList<>(length);
                for (int i : current) {
                    resultItem.add(input[i]);
                }
                result.add(resultItem);
                return;
            }
            for (int i = 0; i < length; i++) {
                int index = indices[i];
                if (index < 0) {
                    continue;
                }
                current[length - remaining] = index;
                indices[i] = -1;
                collectPermutations(result, input, current, indices, remaining - 1);
                indices[i] = i;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>(1 << length);
        int[] indices = new int[length];
        for (int i = 0; i < length; i++) {
            indices[i] = i;
        }
        collectPermutations(result, nums, indices, length);
        return result;
    }

    private void collectPermutations(List<List<Integer>> result, int[] input, int[] indices, int remaining) {
        int length = input.length;
        if (remaining <= 0) {
            List<Integer> resultItem = new ArrayList<>(length);
            for (int i : indices) {
                resultItem.add(input[i]);
            }
            result.add(resultItem);
            return;
        }
        for (int i = 0; i < remaining; i++) {
            int index = indices[i];
            int offset = remaining - 1;
            indices[i] = indices[offset];
            indices[offset] = index;
            collectPermutations(result, input, indices, remaining - 1);
            indices[offset] = indices[i];
            indices[i] = index;
        }
    }
}
