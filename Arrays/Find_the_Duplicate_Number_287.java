// Find the Duplicate Number (LeetCode 287)
// https://leetcode.com/problems/find-the-duplicate-number/
// This problem is similar to the Missing Number problem, but instead of finding a missing number, we are looking for a duplicate number in an array of integers. The input array contains n + 1 integers where each integer is in the range [1, n] inclusive. There is only one repeated number in the array, but it could be repeated more than once. The goal is to find that duplicate number.  
import java.util.HashSet;
public class Find_the_Duplicate_Number_287 {
    // approah 1
    public int findDuplicate(int[] nums) {
        int dup=-1;
        for(int i=1;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(i==nums[j])
                {
                    count++;
                }
            }
            if(count>1)
            {
                dup=i;
                break;
            }
        } 
        return dup;   
    }
    //time complexity: O(n^2), where n is the length of the input array. We have a nested loop that iterates through the range of numbers from 1 to n and counts the occurrences of each number in the input array.
    //space complexity: O(1), as we are using a constant amount of extra space
    // but this approach is not efficient for large input arrays, as it has a time complexity of O(n^2). A more efficient approach would be to use a HashSet to keep track of the numbers we have seen so far, and return the first number that we encounter twice. This would have a time complexity of O(n) and a space complexity of O(n).
    //approach 2
    public int findDuplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums) {
            if(!set.add(x)) {
                return x; // Return the first duplicate number found
            }
        }
        return -1; // If no duplicate is found (though the problem guarantees one exists)
    }
    //time complexity: O(n), where n is the length of the input array. We iterate through the input array once, and each insertion into the HashSet takes O(1) time on average.
    //space complexity: O(n), as we are using a HashSet to store the unique numbers we have seen so far, which can take up to O(n) space in the worst case.
    public static void main(String[] args) {    
        Find_the_Duplicate_Number_287 obj = new Find_the_Duplicate_Number_287();
        int[] nums = {3, 1, 3, 4, 2};
        System.out.println("Duplicate number (approach 1): " + obj.findDuplicate(nums));
        System.out.println("Duplicate number (approach 2): " + obj.findDuplicate2(nums));
    }
}
