//  Check if Array Is Sorted and Rotated
// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
// Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
// There may be duplicates in the original array.
// Example 1:
// Input: nums = [3,4,5,1,2]
// Output: true
// Explanation: The array was originally [1,2,3,4,5] and then rotated 3 positions.
//====================================================================
// approach 1
//compare each element with the next one and count the number of times the order is violated. If the count is more than 1, return false. Otherwise, return true.
class check_arr_sort_and_rotated {
    public boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }
        return count <= 1;
    }
    public static void main(String[] args) {
        check_arr_sort_and_rotated solution1 = new check_arr_sort_and_rotated();
        int[] nums1 = {3, 4, 5, 1, 2} ;
        System.out.println(solution1.check(nums1)); // Output: true
        int[] nums2 = {2, 1, 3, 4} ;
        System.out.println(solution1.check(nums2)); // Output: false
    }
}
//time complexity: O(n), where n is the length of the array. We traverse the array once to count the number of order violations.
//space complexity: O(1), as we are using a constant amount of extra space for the count variable.