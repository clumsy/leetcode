package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.QUADRATIC_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem1442 {
    public int countTriplets(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] ^= arr[i - 1];
        }
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int xor = arr[j] ^ (i == 0 ? 0 : arr[i - 1]);
                if (xor == 0) {
                    count += j - i; // the number of triplets equals the length of the interval
                }
            }
        }
        return count;
    }
}
