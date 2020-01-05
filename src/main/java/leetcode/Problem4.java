package leetcode;

public class Problem4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (sorted(nums1, nums2)) {
            return median(nums1, nums2);
        }
        if (sorted(nums2, nums1)) {
            return median(nums2, nums1);
        }
        int[] smaller, bigger;
        if (nums1.length <= nums2.length) {
            smaller = nums1;
            bigger = nums2;
        } else {
            smaller = nums2;
            bigger = nums1;
        }
        int smallerLength = smaller.length;
        int biggerLength = bigger.length;
        int total = smallerLength + biggerLength;
        boolean isOdd = total % 2 == 1;
        int half = (total + 1)/2;
        int smallerElements = (smallerLength + 1)/2;
        int leftBoundary = 0;
        int rightBoundary = smallerLength;
        int biggerElements = half - smallerElements;
        while (true) {
            if (smallerElements == 0 || biggerElements == 0) {
                break;
            }
            if (biggerElements < biggerLength) {
                boolean smallerIsGreater = smaller[smallerElements - 1] > bigger[biggerElements];
                if (smallerIsGreater) {
                    rightBoundary = smallerElements;
                    smallerElements = smallerElements/2;
                    biggerElements = half - smallerElements;
                    continue;
                }
            }
            if (smallerElements < smallerLength) {
                boolean biggerIsGreater = bigger[biggerElements - 1] > smaller[smallerElements];
                if (biggerIsGreater) {
                    leftBoundary = smallerElements;
                    smallerElements = (leftBoundary + rightBoundary + 1)/2;
                    biggerElements = half - smallerElements;
                    continue;
                }
            }
            break;
        }
        int biggestOfSmallest = biggestOfSmallest(smaller, smallerElements, bigger, biggerElements);
        if (isOdd) {
            return biggestOfSmallest;
        }
        int smallestOfBiggest = smallestOfBiggest(smaller, smallerElements, bigger, biggerElements);
        return (biggestOfSmallest + smallestOfBiggest)/2.;
    }

    private int smallestOfBiggest(int[] smaller, int smallerElements, int[] bigger, int biggerElements) {
        if (smallerElements < smaller.length) {
            if (biggerElements < bigger.length) {
                return Math.min(smaller[smallerElements], bigger[biggerElements]);
            }
            return smaller[smallerElements];
        }
        return bigger[biggerElements];
    }

    private static int biggestOfSmallest(int[] smaller, int smallerElements, int[] bigger, int biggerElements) {
        if (biggerElements > 0) {
            if (smallerElements > 0) {
                return Math.max(smaller[smallerElements - 1], bigger[biggerElements - 1]);
            }
            return bigger[biggerElements - 1];
        }
        return smaller[smallerElements - 1];
    }

    private static boolean sorted(int[] first, int[] second) {
        if (first.length == 0 || second.length == 0) {
            return true;
        }
        return first[first.length - 1] < second[0];
    }

    private static double median(int[] first, int[] second) {
        int total = first.length + second.length;
        boolean isOdd = total % 2 == 1;
        int half = (total - 1)/2;
        if (isOdd) {
            return getAt(first, second, half);
        }
        return (getAt(first, second, half) + getAt(first, second, half + 1))/2;
    }

    private static double getAt(int[] first, int[] second, int index) {
        if (index >= first.length) {
            return second[index - first.length];
        }
        return first[index];
    }
}
