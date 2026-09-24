// Squares of a Sorted Array
// leetcode link : https://leetcode.com/problems/squares-of-a-sorted-array/description/
import java.util.Arrays;
public class Squares_of_a_Sorted_Array_977 {
    public static int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i]=nums[i]*nums[i];
        }    
        Arrays.sort(nums);
        return nums;
    } 
    // time : o(nlogn)
    //space: o(1);

    // two pointer approach
    // time : O(n)
    public static int[] sortedSquares1(int[] nums) {
        int left=0;
        int i=0;
        int res[] = new int[nums.length];
        int right= nums.length-1;
        while(left<=right) {
            if(Math.abs(nums[left]) < Math.abs(nums[right])) {
                res[i] = nums[right] * nums[right];
                i++;
                right--;
            }
            else {
                res[i] = nums[left] * nums[left];
                i++;
                left++;
            }
            if(left == right) {
                res[i] = nums[left] * nums[left];
            }
        }
        int j=0;
        for(int k=nums.length-1; k >= 0; k--){
            nums[j++]=res[k];
        }    
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
        int[] nums1 = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares1(nums1)));
    }
}
