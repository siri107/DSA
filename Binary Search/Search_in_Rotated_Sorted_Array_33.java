// Search in Rotated Sorted Array
// lc link : https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class Search_in_Rotated_Sorted_Array_33 {
    public int search(int[] nums, int target) {
        int l=0;
        int r= nums.length-1;
        while(l<=r) {
            int mid = l+(r-l)/2;
            if(nums[mid]==target) return mid;
            if(nums[l] <= nums[mid]) {
                if(nums[l] <= target && target<= nums[mid])
                    r = mid-1;
                else
                    l = mid+1;
            }
            else {
                if(nums[mid] <= target && target<= nums[r])
                    l = mid+1;
                else
                    r = mid-1;
            }
        }
        return -1;
    }
    // time : O(logn)
    // space : O(1)
    public static void main(String[] args) {
        Search_in_Rotated_Sorted_Array_33 obj = new Search_in_Rotated_Sorted_Array_33();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(obj.search(nums,target));
    }
}
