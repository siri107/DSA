// Special Array With X Elements Greater Than or Equal X
//leetcode problem link: https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/       
import java.util.Arrays;
public class Special_Array_With_X_Elements_Greater_Than_or_Equal_X_1608 {
    public int specialArray(int[] nums) {
        int n = nums.length;
        for (int x = 0; x <= n; x++) {
            int count = 0;
            for (int num : nums) {
                if (num >= x) {
                    count++;
                }
            }
            if (count == x) {
                return x;
            }
        }
        return -1;
    }
    //time complexity: O(n^2), where n is the length of the input array. We have two nested loops that iterate through the array to count the number of elements greater than or equal to x.
    //space complexity: O(1), as we are using a constant amount of extra space
    //approach 2
    // using sorting and binary search to find the special number x. This would have a time complexity of O(nlogn) and a space complexity of O(1).
    // The idea is to sort the array and then for each possible value of x, we can use binary search to find the first index where the value is greater than or equal to x. The number of elements greater than or equal to x will be n - index, where n is the length of the array.
    public int specialArrayBinarySearch(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int x = 0; x <= n; x++) {
            int left = 0, right = n - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] >= x) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (n - left == x) {
                return x;
            }
        }
        return -1;
    }
public static void main(String[] args) {
        Special_Array_With_X_Elements_Greater_Than_or_Equal_X_1608 obj = new Special_Array_With_X_Elements_Greater_Than_or_Equal_X_1608();
        int[] nums = {3,3,6,6,7,8,8,9};
        System.out.println(obj.specialArray(nums)); 
        System.out.println(obj.specialArrayBinarySearch(nums)); 
}    
}