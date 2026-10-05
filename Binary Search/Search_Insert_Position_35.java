// Search Insert Position
// link: https://leetcode.com/problems/search-insert-position/description/
public class Search_Insert_Position_35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        
        return left;  
    }
    // time : O(logn), where n is the length of the array. We perform a binary search on the sorted array, which takes logarithmic time.
    // space : O(1)
    public static void main(String[] args) {
        Search_Insert_Position_35 solution = new Search_Insert_Position_35();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println(solution.searchInsert(nums, target)); // Output: 2
    } 
}
