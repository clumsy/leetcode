package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null) {
            return Collections.emptyList();
        }
        int m = matrix.length;
        if (m == 0) {
            return Collections.emptyList();
        }
        int n = matrix[0].length;
        if (n == 0) {
            return Collections.emptyList();
        }
        List<Integer> result = new ArrayList<>(m*n);
        for (int k = 0, count = (Math.min(m, n) + 1)/2; k < count; k++) {
            int maxM = m - k - 1;
            int maxN = n - k - 1;
            if (k == maxM) {
                for (int i = k; i <= maxN; i++) {
                    result.add(matrix[k][i]);
                }
                break;
            }
            if (k == maxN) {
                for (int i = k; i <= maxM; i++) {
                    result.add(matrix[i][k]);
                }
                break;
            }
            for (int i = k; i < maxN; i++) {
                result.add(matrix[k][i]);
            }
            for (int i = k; i < maxM; i++) {
                result.add(matrix[i][maxN]);
            }
            for (int i = k; i < maxN; i++) {
                result.add(matrix[maxM][maxN + k - i]);
            }
            for (int i = k; i < maxM; i++) {
                result.add(matrix[maxM + k - i][k]);
            }
        }
        return result;
    }
}
