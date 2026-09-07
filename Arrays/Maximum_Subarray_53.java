// maximum subarray problem
// leetcode problem: https://leetcode.com/problems/maximum-subarray/    
// approach 1
// using brute force to check all subarrays and return the maximum sum. This would have a time complexity of O(n^2) and a space complexity of O(1).             

public class Maximum_Subarray_53 {
     public int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum>maxsum)
                {
                    maxsum=sum;
                }
            }
        }
        return maxsum;  
    }
    //time complexity: O(n^2), where n is the length of the input array. We have two nested loops that iterate through the array to find the maximum sum of all subarrays.
    //space complexity: O(1), as we are using a constant amount of extra space  
    //approach 2
    //using Kadane's algorithm to find the maximum sum of a contiguous subarray in linear
    public int maxSubArrayKadane(int[] nums) {
        int maxsum=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum>maxsum)
            {
                maxsum=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return maxsum;  
    }
    //time complexity: O(n), where n is the length of the input array. We iterate through the array once to find the maximum sum of a contiguous subarray.
    //space complexity: O(1), as we are using a constant amount of extra space
    public static void main(String[] args) {
        Maximum_Subarray_53 obj = new Maximum_Subarray_53();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum subarray sum (approach 1): " + obj.maxSubArray(nums)); // Output: 6
        System.out.println("Maximum subarray sum (approach 2): " + obj.maxSubArrayKadane(nums)); // Output: 6
    }
}
