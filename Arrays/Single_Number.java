// Find the single number in an array where every other element appears twice
// https://leetcode.com/problems/single-number/description/
import java.util.*;
public class Single_Number {
    // approach: Use XOR operation to find the unique number. XOR of a number with itself is 0, and XOR of a number with 0 is the number itself. Therefore, XORing all numbers will cancel out the numbers that appear twice, leaving only the unique number.       
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation to find the unique number
        }
        return result;
    }
    //time complexity: O(n), where n is the number of elements in the array. We iterate through the array once.
    //space complexity: O(1), we use a constant amount of space for the result variable.
    //approach: Use a HashSet to keep track of the numbers we have seen. If we encounter a number that is already in the set, we remove it. At the end, the set will contain only the unique number.    
    public int singleNumberUsingSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num); // Remove the number if it appears again
            } else {
                set.add(num); // Add the number to the set
            }
        }
        return set.iterator().next(); // Return the unique number
    }
    public static void main(String[] args) {
        Single_Number obj = new Single_Number();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(obj.singleNumber(nums)); // Output: 4
        System.out.println(obj.singleNumberUsingSet(nums)); // Output: 4
    }
}