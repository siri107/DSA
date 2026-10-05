// Split Array Largest Sum
// lc link : https://leetcode.com/problems/split-array-largest-sum/description/
public class Split_Array_Largest_Sum_410 {
    public int splitArray(int[] nums, int k) {
        int sum=0;
        int max=0;
        int ans=0;
        for(int i=0; i< nums.length ; i++){
            max= Math.max(max, nums[i]);
            sum+= nums[i];
        } 
        int l= max;
        int r= sum;
        while(l<=r) {
            int mid= l + (r-l)/2;
            int s=0;
            int c=1;
            
            for(int i=0; i<nums.length; i++) {
                if(s+nums[i]>mid) {
                    c++;
                    s= nums[i];
                }
                else
                    s+= nums[i];
            }
            if(c <= k){
                r = mid-1;
                ans= mid;
            }  
            else
                l = mid+1;
        } 
        return ans;
    }
    // time : O(nlogm), where n is the length of the array and m is the maximum value in the array. We perform a binary search on the range of possible sums, which takes O(logm) time, and for each sum, we traverse the array to count the number of subarrays required, which takes O(n) time.
    // space : O(1)
    public static void main(String[] args) {
        Split_Array_Largest_Sum_410 solution = new Split_Array_Largest_Sum_410();
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;
        System.out.println(solution.splitArray(nums, k)); // Output: 18
    }
}
