// Find Minimum in Rotated Sorted Array
// lc link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public class Find_Minimum_in_Rotated_Sorted_Array_153 {
    public int findMin(int[] nums) {
        int l=0;
        int r= nums.length -1;
        int min=nums[0];
        while( l<=r ) {
            int mid = l+(r-l)/2;
            min= Math.min(min,nums[mid]);
            if(nums[mid] >= nums[r]) {
                
                l=mid+1;
            }
            else r=mid-1;
        }
        return min;
    }
    // time : O(logn)
    // space : O(1)
    public static void main(String[] args) {
        Find_Minimum_in_Rotated_Sorted_Array_153 obj = new Find_Minimum_in_Rotated_Sorted_Array_153();
        int[] nums = {3,4,5,1,2};
        System.out.println(obj.findMin(nums));
    }
}
