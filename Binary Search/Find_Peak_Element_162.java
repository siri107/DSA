// Find Peak Element
// lc link : https://leetcode.com/problems/find-peak-element/description/
public class Find_Peak_Element_162 {
    public int findPeakElement(int[] nums) {
        int n= nums.length;
        if(n==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;
        int l=1;
        int h=n-2;
        while(l<=h) {
            int mid = l+(h-l)/2;
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1])
                return mid;
            else if(nums[mid] > nums[mid-1])
                l = mid+1;
            else
                h = mid-1;
        }
        return -1;
    }
    // time : O(logn)
    // space : O(1)
    public static void main(String[] args) {
        Find_Peak_Element_162 obj = new Find_Peak_Element_162();
        int[] nums = {1, 2, 3, 1};
        System.out.println(obj.findPeakElement(nums));
    }
}
