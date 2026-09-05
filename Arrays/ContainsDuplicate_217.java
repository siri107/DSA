// Contains Duplicate (LeetCode 217)
// https://leetcode.com/problems/contains-duplicate/
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
import java.util.HashSet;
public class ContainsDuplicate_217 {
    //approach 1
    //using HashSet to keep track of the numbers we have seen so far, and return the first number that we encounter twice. This would have a time complexity of O(n) and a space complexity of O(n).
    //time complexity: O(n), where n is the length of the input array. We iterate through the input array once, and each insertion into the HashSet takes O(1) time on average.
    //space complexity: O(n), as we are using a HashSet to store the unique numbers we have seen so far, which can take up to O(n) space in the worst case.
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicate_217 obj = new ContainsDuplicate_217();
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Contains duplicate (approach 1): " + obj.containsDuplicate(nums1)); // Output: true
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Contains duplicate (approach 1): " + obj.containsDuplicate(nums2)); // Output: false
    }
}
