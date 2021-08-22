package leetcode;

@BeatsPercent(100)
@TimeComplexity(worst = Complexity.N_PLUS_M) // where N and M are the lengths of the first and second strings
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem165 {
    public int compareVersion(String version1, String version2) {
        char[] v1 = version1.toCharArray();
        char[] v2 = version2.toCharArray();
        int[] t1 = new int[2];
        int[] t2 = new int[2];
        while (t1[0] < v1.length || t2[0] < v2.length) {
            int diff = nextVersion(v1, t1) - nextVersion(v2, t2);
            if (diff < 0) {
                return -1;
            } else if (diff > 0) {
                return +1;
            }
        }
        return 0;
    }

    private int nextVersion(char[] version, int[] tuple) {
        int start = tuple[0];
        if (start >= version.length) {
            return 0;
        }
        int revision = 0;
        while (start < version.length && version[start] == '0') {
            start++;
        }
        while (start < version.length && version[start] != '.') {
            revision = revision*10 + (version[start++] - '0');
        }
        tuple[0] = start + 1;
        tuple[1] = revision;
        return revision;
    }
}
