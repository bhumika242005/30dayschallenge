import java.util.*;

public class MedianOfTwoSortedArrays {

    public static double findMedian(int[] a, int[] b) {

        // Always apply binary search on smaller array
        if (a.length > b.length)
            return findMedian(b, a);

        int m = a.length, n = b.length;
        int low = 0, high = m;

        while (low <= high) {

            int cut1 = (low + high) / 2;
            int cut2 = (m + n + 1) / 2 - cut1;

            int L1 = (cut1 == 0) ? Integer.MIN_VALUE : a[cut1 - 1];
            int R1 = (cut1 == m) ? Integer.MAX_VALUE : a[cut1];

            int L2 = (cut2 == 0) ? Integer.MIN_VALUE : b[cut2 - 1];
            int R2 = (cut2 == n) ? Integer.MAX_VALUE : b[cut2];

            // Correct partition
            if (L1 <= R2 && L2 <= R1) {

                if ((m + n) % 2 == 0)
                    return (Math.max(L1, L2) + Math.min(R1, R2)) / 2.0;
                else
                    return Math.max(L1, L2);
            }
            else if (L1 > R2) {
                high = cut1 - 1;
            }
            else {
                low = cut1 + 1;
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 3, 4, 6};
        int[] nums2 = {2, 6};

        double median = findMedian(nums1, nums2);
        System.out.println("Median = " + median);
    }
}
