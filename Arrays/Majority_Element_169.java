// Majority Element (LeetCode 169)
// https://leetcode.com/problems/majority-element/
// Given an array nums of size n, return the majority element. The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

import java.util.HashMap;
import java.util.Map;

public class Majority_Element_169 {
    //approach 1
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majorityCount = n / 2;
        for (int num : nums) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] == num) {
                    count++;
                }
            }
            if (count > majorityCount) {
                return num;
            }
        }
        return -1; // This line will never be reached since the problem guarantees a majority element exists.
    }
    //time complexity: O(n^2), where n is the length of the input array. We have a nested loop that iterates through the input array to count the occurrences of each element.
    //space complexity: O(1), as we are using a constant amount of extra space  
    //approach 2
    //using HashMap to count the occurrences of each element and return the one that exceeds n/2.
    public int majorityElement1(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        int max = 0;
        int maxKey=-1;
       for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;  
    }    
    //time complexity: O(n), where n is the length of the input array. We iterate through the input array once to count the occurrences of each element and then iterate through the HashMap to find the majority element.
    //space complexity: O(n), as we are using a HashMap to store the occurrences of each element, which can take up to O(n) space in the worst case.
    public static void main(String[] args) {    
        Majority_Element_169 obj = new Majority_Element_169();
        int[] nums = {3, 2, 3};
        System.out.println("Majority element (approach 1): " + obj.majorityElement(nums));
        System.out.println("Majority element (approach 2): " + obj.majorityElement1(nums));
    }
}
