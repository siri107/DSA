// Maximum Average Subarray I
// lc link : https://leetcode.com/problems/maximum-average-subarray-i/description/

public class Maximum_Average_Subarray_I_643 {
    // using sliding window
    public static double findMaxAverage(int[] nums, int k) {
        int l=0;
        int r=k-1;
        int sum=0;
        for(int i=l;i<=r;i++) {
            sum+=nums[i];
        }
        double maxavg=(double)sum/k;
        while( r<nums.length-1) {
            r++;
            sum+= nums[r];
            sum-=nums[l];
            l++;       
            double avg=(double)sum/k;
            maxavg= Math.max(maxavg , avg);
        }
        return maxavg;
    }
    // time: O(n)
    //space : O(1)
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k=4;
        System.out.print(findMaxAverage(nums,k));
    }
}
