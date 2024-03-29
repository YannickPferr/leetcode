package other.medium;

/**
 * Problem: 907. Sum of Subarray Minimums
 * Difficulty: Medium
 * Link: https://leetcode.com/problemssum-of-subarray-minimums
 */
public class SumOfSubarrayMinimums {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for (int pile : piles)
            r = Math.max(r, pile);

        int m = 0;
        while (l <= r) {
            m = l + (r - l) / 2;
            int hLeft = canFinish(piles, h, m);
            if (hLeft >= 0)
                r = m - 1;
            else
                l = m + 1;
        }

        return l;
    }

    public int canFinish(int[] piles, int h, int k) {
        for (int pile : piles)
            h -= Math.ceil((double) pile / k);
        return h;
    }
}