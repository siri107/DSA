// two sum problem
// leetcode problem: https://leetcode.com/problems/two-sum/
import java.util.HashMap;
public class Two_Sum_1 {
    //approach 1
    //using brute force to check all pairs of numbers in the array and return the indices of the pair that sums up to the target value. This would have a time complexity of O(n^2) and a space complexity of O(1).
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // Return [-1, -1] if no solution is found
    }
    //time complexity: O(n^2), where n is the length of the input array. We have two nested loops that iterate through the array to find the pair of indices that sum up to the target value.
    //space complexity: O(1), as we are using a constant amount of extra space
    //approach 2
    //using a HashMap to store the numbers we have seen so far and their corresponding indices
    //as we iterate through the array. For each number, we check if the complement (target - current number) exists in the HashMap. If it does, we return the indices of the current number and its complement. This would have a time complexity of O(n) and a space complexity of O(n).
    public int[] twoSumUsingHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1}; // Return [-1, -1] if no solution is found
    }
    //time complexity: O(n), where n is the length of the input array. We iterate through the array once, and each lookup and insertion into the HashMap takes O(1) time on average.
    //space complexity: O(n), as we are using a HashMap to store the numbers
    public static void main(String[] args) {
        Two_Sum_1 obj = new Two_Sum_1();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result1 = obj.twoSum(nums, target);
        System.out.println("Indices (approach 1): [" + result1[0] + ", " + result1[1] + "]"); // Output: [0, 1]
        int[] result2 = obj.twoSumUsingHashMap(nums, target);
        System.out.println("Indices (approach 2): [" + result2[0] + ", " + result2[1] + "]"); // Output: [0, 1]
    }
}
