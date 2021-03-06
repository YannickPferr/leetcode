package binarysearch.easy;

/**
 * Problem: 704. Binary Search
 * Difficulty: Easy
 * Link: https://leetcode.com/problemsbinary-search
 */
public class BinarySearch {
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }

        return -1;
    }
}